# JavaProExceptions

Quando executado no Windows ele retorna essa mesangem.

ns.AlunosMain mp\\cp_ap09cqks9lrb3ncehlz26pgsy.argfile br.com.mentorama.execption
Exception in thread "main" java.nio.file.InvalidPathException: Illegal char <:> at index 2: /C:/Users/AdrianoPC/EnvioGit/mentorama.execptions/target/classes/aluno.txt
        at java.base/sun.nio.fs.WindowsPathParser.normalize(WindowsPathParser.java:182)
        at java.base/sun.nio.fs.WindowsPathParser.parse(WindowsPathParser.java:153)
        at java.base/sun.nio.fs.WindowsPathParser.parse(WindowsPathParser.java:77)
        at java.base/sun.nio.fs.WindowsPath.parse(WindowsPath.java:92)
        at java.base/sun.nio.fs.WindowsFileSystem.getPath(WindowsFileSystem.java:229)
        at java.base/java.nio.file.Path.of(Path.java:147)
        at br.com.mentorama.execptions.AlunosService.findAll(AlunosService.java:17)
        at br.com.mentorama.execptions.AlunosService.findAluno(AlunosService.java:24)
        at br.com.mentorama.execptions.AlunosMain.main(AlunosMain.java:8)
