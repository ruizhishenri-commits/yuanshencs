#!/bin/sh
# Gradle wrapper
DIR=`dirname "$0"`
exec java -cp "$DIR/gradle/wrapper/gradle-wrapper.jar" org.gradle.wrapper.GradleWrapperMain "$@"
