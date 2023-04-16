FROM sbtscala/scala-sbt:graalvm-ce-21.3.0-java17_1.8.1_3.2.1 as build

RUN gu install native-image

COPY ./ /app/
WORKDIR /app

RUN sbt GraalVMNativeImage/packageBin

FROM almalinux:latest as app

WORKDIR /app
COPY --from=build /app/target/graalvm-native-image/* .

ENTRYPOINT ["./test-scala3-graalvm"]
