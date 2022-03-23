jar_version=1.6
jar_dir="$HOME/.local/share/java"
jar_file="$jar_dir/google-java-format-$jar_version-all-deps.jar"
java_cmd="java"

echo $jar_file
pwd
echo "Hello"
    
# git status | sh    
#git diff -z --staged --name-only --diff-filter=ACMR | grep -z '.java$' | sh
    # run google-java-format on each file and re-stage any new changes
    #xargs -0 -I % $java_cmd -jar $jar_file '%'; git add -f '%' | sh    