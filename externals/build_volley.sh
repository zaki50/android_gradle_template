#!/bin/sh
set -x

work_dir=volley_work
rm -rf "$work_dir"
mkdir "$work_dir"

pushd "$work_dir"

  git clone https://android.googlesource.com/platform/frameworks/volley
  cd volley
  ant jar
  cp  bin/volley.jar ../../

popd
