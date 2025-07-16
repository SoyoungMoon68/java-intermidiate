package lang.system;

import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {
        //현재 시간(밀리초)를 가져옴
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        //현재 시간(나노초)를 가져옴
        long currentTimeNano = System.nanoTime();
        System.out.println("currentTimeNano = " + currentTimeNano);

        //환경 변수를 읽음
        System.out.println("getenv = " + System.getenv());

        //시스템 속성을 읽음
        System.out.println("properties = " + System.getProperties());
        System.out.println("Java version = " + System.getProperty("java.version"));

        //배열을 고속으로 복사
        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);

        //배열 출력
        System.out.println("copiedArray = " + copiedArray);
        System.out.println("copiedArray = " + Arrays.toString(copiedArray));

        //프로그램 종료
        System.exit(0);
        System.out.println("hello");

    }
}

//currentTimeMillis = 1752643230097
//currentTimeNano = 423208346095208
//getenv = {COMMAND_MODE=unix2003, LC_CTYPE=en_US.UTF-8, SHELL=/bin/zsh, TMPDIR=/var/folders/68/n6sx46_x5k56yp5yxgdg81sm0000gn/T/, __CFBundleIdentifier=com.jetbrains.intellij, HOME=/Users/soyoungmoon, SSH_AUTH_SOCK=/private/tmp/com.apple.launchd.mZ8fkZ3K3r/Listeners, OLDPWD=/, XPC_SERVICE_NAME=application.com.jetbrains.intellij.2714117.2715002, PATH=/Library/Frameworks/Python.framework/Versions/3.11/bin:/usr/local/bin:/System/Cryptexes/App/usr/bin:/usr/bin:/bin:/usr/sbin:/sbin:/var/run/com.apple.security.cryptexd/codex.system/bootstrap/usr/local/bin:/var/run/com.apple.security.cryptexd/codex.system/bootstrap/usr/bin:/var/run/com.apple.security.cryptexd/codex.system/bootstrap/usr/appleinternal/bin:/usr/local/bin, LOGNAME=soyoungmoon, USER=soyoungmoon, __CF_USER_TEXT_ENCODING=0x1F5:0x0:0x0, XPC_FLAGS=0x0, PWD=/Users/soyoungmoon/Desktop/Coding/java-mid1}
//properties = {java.specification.version=21, sun.jnu.encoding=UTF-8, java.class.path=/Users/soyoungmoon/Desktop/Coding/java-mid1/out/production/java-mid1, java.vm.vendor=Microsoft, sun.arch.data.model=64, java.vendor.url=https://www.microsoft.com, java.vm.specification.version=21, os.name=Mac OS X, sun.java.launcher=SUN_STANDARD, user.country=US, sun.boot.library.path=/Users/soyoungmoon/Library/Java/JavaVirtualMachines/ms-21.0.7/Contents/Home/lib, sun.java.command=lang.system.SystemMain, http.nonProxyHosts=local|*.local|169.254/16|*.169.254/16|127.0.0.1:21300|*.127.0.0.1:21300, jdk.debug=release, sun.cpu.endian=little, user.home=/Users/soyoungmoon, user.language=en, sun.stderr.encoding=UTF-8, java.specification.vendor=Oracle Corporation, java.version.date=2025-04-15, java.home=/Users/soyoungmoon/Library/Java/JavaVirtualMachines/ms-21.0.7/Contents/Home, file.separator=/, java.vm.compressedOopsMode=Zero based, sun.stdout.encoding=UTF-8, line.separator=
//, java.vm.specification.vendor=Oracle Corporation, java.specification.name=Java Platform API Specification, apple.awt.application.name=SystemMain, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, ftp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16|127.0.0.1:21300|*.127.0.0.1:21300, java.runtime.version=21.0.7+6-LTS, user.name=soyoungmoon, stdout.encoding=UTF-8, path.separator=:, os.version=15.4.1, java.runtime.name=OpenJDK Runtime Environment, file.encoding=UTF-8, java.vm.name=OpenJDK 64-Bit Server VM, java.vendor.version=Microsoft-11369939, java.vendor.url.bug=https://github.com/microsoft/openjdk/issues, java.io.tmpdir=/var/folders/68/n6sx46_x5k56yp5yxgdg81sm0000gn/T/, java.version=21.0.7, user.dir=/Users/soyoungmoon/Desktop/Coding/java-mid1, os.arch=aarch64, java.vm.specification.name=Java Virtual Machine Specification, native.encoding=UTF-8, java.library.path=/Users/soyoungmoon/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:., java.vm.info=mixed mode, sharing, stderr.encoding=UTF-8, java.vendor=Microsoft, java.vm.version=21.0.7+6-LTS, sun.io.unicode.encoding=UnicodeBig, socksNonProxyHosts=local|*.local|169.254/16|*.169.254/16|127.0.0.1:21300|*.127.0.0.1:21300, java.class.version=65.0}
//Java version = 21.0.7
//copiedArray = [C@27bc2616
//copiedArray = [h, e, l, l, o]
