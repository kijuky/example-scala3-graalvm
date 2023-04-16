# Example Scala3 on GraalVM

## How to run

Using docker when build.

```
% docker build .
...(snip)
 => => writing image sha256:<<sha256>>
% docker run -it --rm <<sha256>>
Hello world!
I was compiled by Scala 3. :)
```