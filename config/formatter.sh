#!/bin/sh -e
jar_version=1.6
jar_dir="$HOME/.local/share/java"
jar_file="$jar_dir/google-java-format-$jar_version-all-deps.jar"
java_cmd="java"

echo $jar_file
# download jar file if missing
if [ ! -f "$jar_file" ]; then
    mkdir -p "$jar_dir"
    # wget -O "$jar_file" https://github.com/google/google-java-format/releases/download/google-java-format-$jar_version/google-java-format-$jar_version-all-deps.jar
    curl -L https://github.com/google/google-java-format/releases/download/google-java-format-$jar_version/google-java-format-$jar_version-all-deps.jar -o "$jar_file"
fi

# execute formatter
echo $@
$java_cmd -jar "$jar_file" $@