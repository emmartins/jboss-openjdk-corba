How to sync fork with OpenJDK Corba
=========================

1. Build OpenJDK, some sources are only generated in that process. Corba sources should be in "classes" inside build/linux-amd64/corba/dist/lib/src.zip

2. Copy the sources into "src-new/main/java" in this directory, and run the package refactoring script "refactoring.sh"

3. The sources used in last sync are in src-origin dir. Do a diff patch, and then patch the src directory of fork with it.

Example:
diff -urN src-origin src-new > resync.patch
cd src
patch -p1 -i ../resync.patch

4. Replace the content of src-origin directory with the one of src-new.

=========================

Current OpenJDK Corba branch used: 7u