#!/bin/sh
cd cloverage
lein release
cd ../lein-cloverage
lein release
cd ..