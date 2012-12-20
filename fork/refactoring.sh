export LANGG=$LANG
export LC_CTYPEE=$LC_CTYPE
export LANG=C
export LC_CTYPE=C
grep -rl "com.sun.corba" ./src-new | xargs sed -i "" 's|com.sun.corba|comm.sunn.corbaa|g'
grep -rl "com.sun.org.omg" ./src-new | xargs sed -i "" 's|com.sun.org.omg|org.jboss.com.sun.org.omg|g'
grep -rl "com.sun.tools.corba" ./src-new | xargs sed -i "" 's|com.sun.tools.corba|org.jboss.com.sun.tools.corba|g'
grep -rl "sun.corba" ./src-new | xargs sed -i "" 's|sun.corba|org.jboss.sun.corba|g'
grep -rl "sun.rmi.rmic.iiop" ./src-new | xargs sed -i "" 's|sun.rmi.rmic.iiop|org.jboss.sun.rmi.rmic.iiop|g'
grep -rl "comm.sunn.corbaa" ./src-new | xargs sed -i "" 's|comm.sunn.corbaa|org.jboss.com.sun.corba|g'
export LANG=$LANGG
unset LANGG
export LC_CTYPE=$LC_CTYPEE
unset LC_TYPEE
mkdir src-new/main/java/org/jboss
mv src-new/main/java/com src-new/main/java/org/jboss/com
mv src-new/main/java/sun src-new/main/java/org/jboss/sun
# remove javax packages which have no dependency to openjdk's corba impl
rm -RF src-new/main/java/javax/activity
rm -RF src-new/main/java/javax/transaction