cmake_minimum_required(VERSION 3.4.1)

add_library(native-lib SHARED
    src/main/cpp/native-lib.cpp)

target_link_libraries(native-lib log)