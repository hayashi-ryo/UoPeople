# unit2

- Abstraction
- API
- Process States
- System Calls
- 抽象化
- API
- プロセス状態
- システムコール

## Goal

- By the end of this Unit, you will be able to:
  - Analyze and close specific processes in a slow system to increase speed.
  - Identify and explain processes that run on an operating system.
  - Describe system calls and process states in Linux/Unix.
- ja
  - スピードを上げるために、遅いシステムの特定のプロセスを分析し、閉じることができる。
  - オペレーティングシステム上で実行されるプロセスを特定し、説明することができる
  - Linux/Unixのシステムコールとプロセス状態を説明する

## Task

- [x] Reading assignment
- [x] Peer Assessment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [x] Programming assignmet
- [x] Learning Journal
- [x] Take Self-Quiz

## Reading Assignment

1. Arpaci-Dusseau, R. H., & Arpaci-Dusseau, A. C. (2018). Operating systems: three easy pieces (1.01 ed.). Arpaci-Dusseau Books. Retrieved June 16, 2022, from <https://pages.cs.wisc.edu/~remzi/OSTEP/>
  Read Virtualization: Chapter 3 – Dialogue, Chapter 4 – Processes, and Chapter 5 – Process API
    Time Sharing: OSがCPUを分け合うために利用される、分割の考え方。様々な方法がある。
    C言語におけるHeap領域の確保と解放
      malloc(): heap領域の確保
      free(): heap領域の解放
2. Baeldung. (2021, November 9). A guide to POSIX. <https://www.baeldung.com/linux/posix>
  Learn the history of POSIX and how it works with Linux/Unix/Mac systems.
    POSIXは様々なOS間でプログラムの移植性を高めるために標準化されたもの。APIコールや出力形式などが標準化されているため、OS間での修正を必要な範囲に絞ることができる。
3. Franklin, C., & Pollette, C. (2021, November 18). How operating systems work. howstuffworks.   Retrieved June 16, 2022, from <https://computer.howstuffworks.com/operating-system9.htm>
  Learn how operating systems use APIs to call processes and do things.
4. Multitasking. (n.d.). javaTpoint. <https://www.javatpoint.com/multitasking-operating-system>
  Learn how operating systems work in terms of multitasking.
5. Operating system - Process scheduling. (n.d.). Biggest Online Tutorials Library. <https://www.tutorialspoint.com/operating_system/os_process_scheduling.htm>
  Learn how operating systems work in terms of scheduling.
6. System calls in operating system. (n.d.). javaTpoint. <https://www.javatpoint.com/system-calls-in-operating-system>
  Learn what are system calls.

## Discussion Forum

Think of a hypothetical situation where you are working on your Windows computer and it seems to be slowing down over time.  You are curious and look at the processes running on your system.  You wonder what processes are causing the system to slow down and wish to end some to fix this issue.
Utilize the following resources to figure out what might be happening in the system and hypothetically what you need to eliminate to increase speed and free up resources for the system:

[How to Close Unnecessary Processes in Windows 10](https://www.auslogics.com/en/articles/stop-all-processes-in-windows-10/)
[15 Task Manager tips for a faster PC](https://www.techradar.com/news/computing/pc/15-task-manager-tips-for-a-faster-pc-649623)

In your responses to your peers, compare and contrast your answer to those of your peers.

仮想的な状況を考えてみてください。あなたはWindowsコンピュータで作業しており、時間が経つにつれて動作が遅くなっているように感じます。好奇心からシステム上で実行中のプロセスを確認します。どのプロセスがシステムの遅延を引き起こしているのかを知りたいと思い、問題を解決するためにいくつかのプロセスを終了させたいと考えています。

以下のリソースを利用して、システムで何が起こっているのか、速度を上げてシステムのリソースを解放するために何を排除する必要があるのかを仮想的に考えてみてください。

[How to Close Unnecessary Processes in Windows 10](https://www.auslogics.com/en/articles/stop-all-processes-in-windows-10/)
[15 Task Manager tips for a faster PC](https://www.techradar.com/news/computing/pc/15-task-manager-tips-for-a-faster-pc-649623)

ピアへの回答では、自分の回答とピアの回答を比較し、対比させてください。

### Japanese Discussion

1. イントロダクション
Windowsコンピュータが時間とともに動作が遅くなることは、多くのユーザーが経験する一般的な問題です。この現象は、システムのリソースを大量に消費するプロセスが増えることで引き起こされることが多いです。システムのパフォーマンスを維持し、作業効率を向上させるためには、これらのプロセスを特定して適切に対処することが重要です。

2. 原因の特定
最初に行うべきは、タスクマネージャーを起動してシステムで実行中のプロセスを確認することです。タスクマネージャーは「Ctrl + Shift + Esc」のショートカットキーで簡単に起動できます。起動後、「プロセス」タブを選択し、CPU、メモリ、ディスクの使用率が高いプロセスをチェックします。

3. プロセスの調査と特定
リソースを大量に消費しているプロセスを特定したら、そのプロセスが何をしているのかを調査します。知らない名前のプロセスや、システムに不要と思われるプロセスに注目します。特定のプロセスについてインターネットで検索し、その役割や重要性を確認することで、終了しても安全かどうかを判断します。

4. 対処方法：プロセスの終了
不要と判断されたプロセスを終了するには、タスクマネージャーで該当プロセスを右クリックし、「タスクの終了」を選択します。ただし、システムの安定性に影響を与える可能性があるため、終了するプロセスは慎重に選ぶ必要があります。特に、Windowsのシステムプロセスやセキュリティソフトウェアのプロセスは終了しないように注意しましょう。

## Written Assignment

In this assignment, you will:

1. Open your system processes to examine what is running on your system. This will be different depending on your system. Following are the instructions for some popular operating systems:
  Instructions for a Mac: <https://macpaw.com/how-to/see-whats-running-mac#:~:text=Check%20Activity%20Monitor&text=Open%20a%20Finder%20window%20and,on%20your%20Mac%20right%20now>
  Instructions for Windows: <https://docs.microsoft.com/en-us/windows-hardware/drivers/debugger/finding-the-process-id>
  Instructions for Linux: <https://www.cyberciti.biz/faq/how-to-check-running-process-in-linux-using-command-line/>
2. Sort the processes based on CPU usage in descending order.
3. Take screenshots of your system processes.
4. Describe what is running on your system and what you think all these processes are for. You need to describe (at least) the first ten processes.
  Important Note: Do not select the same process twice.

Submit the assignment in MS Word or PDF file.

You will be assessed on:

- Your ability to open and sort the system processes on your system.
- Your description of the processes running on your system.
- Organization and style of the essay (including APA formatting).

以下はOSについてのコースで出題された質問です。質問に回答する文章の作成を手伝ってください。まずは質問を日本語に翻訳してください。

### 質問の日本語訳

この課題では、以下の作業を行います。

1. システムプロセスを開いて、システム上で実行されているものを確認します。これはシステムによって異なります。以下は、いくつかの人気のあるオペレーティングシステムの手順です。
   - Macの手順: [リンク](https://macpaw.com/how-to/see-whats-running-mac#:~:text=Check%20Activity%20Monitor&text=Open%20a%20Finder%20window%20and,on%20your%20Mac%20right%20now)
   - Windowsの手順: [リンク](https://docs.microsoft.com/en-us/windows-hardware/drivers/debugger/finding-the-process-id)
   - Linuxの手順: [リンク](https://www.cyberciti.biz/faq/how-to-check-running-process-in-linux-using-command-line/)
2. CPU使用率に基づいてプロセスを降順に並べ替えます。
3. システムプロセスのスクリーンショットを撮ります。
4. システム上で実行されているプロセスと、これらのプロセスが何のためのものかを説明します。少なくとも最初の10個のプロセスについて説明する必要があります。
   重要な注意: 同じプロセスを2回選択しないでください。

課題はMS WordまたはPDFファイルで提出してください。

評価基準は以下の通りです。

- システムプロセスを開いて並べ替える能力。
- システム上で実行されているプロセスの説明。
- エッセイの組織化とスタイル（APAフォーマットを含む）。

### Written Assignment Japanese

## Learning Journal

**Assignment instructions**
The purpose of this assignment is for you to demonstrate your skills and knowledge regarding describing system calls and process states in Linux/Unix.
Please read the resources below on system calls and process states:

[Linux system call in detail](https://www.geeksforgeeks.org/linux-system-call-in-detail/)
[What are the 5 Linux Process States?](https://www.cbtnuggets.com/blog/certifications/open-source/what-are-the-5-linux-process-states)

Answer the following questions.

1. Discuss the various categories of system calls and explain the functionality of any one system call that is handled by the operating system with an example.
2. Give an example to illustrate the various process states. Why is it expensive to switch between processes? Additionally, discuss the circumstances under which a parent process can stop a child process from executing.

Submission instructions
Your answer should be a minimum of 500 words and not more than 750 words. Use APA citations and references if you use ideas from the readings or other sources. For assistance with APA formatting, view the Learning Resource Center: Academic Writing.  

**課題の指示**
この課題の目的は、Linux/Unixにおけるシステムコールとプロセス状態についての知識とスキルを示すことです。
以下のリソースを読んで、システムコールとプロセス状態について学んでください。

[Linux system call in detail](https://www.geeksforgeeks.org/linux-system-call-in-detail/)
[What are the 5 Linux Process States?](https://www.cbtnuggets.com/blog/certifications/open-source/what-are-the-5-linux-process-states)

次の質問に答えてください。

1. システムコールのさまざまなカテゴリについて議論し、オペレーティングシステムによって処理されるシステムコールの1つの機能を例を用いて説明してください。
2. さまざまなプロセス状態を例を挙げて説明してください。なぜプロセス間の切り替えは高コストなのでしょうか？さらに、親プロセスが子プロセスの実行を停止させる状況について議論してください。

**提出の指示**
回答は最低500語、最大750語であるべきです。リーディングやその他のソースからのアイデアを使用する場合は、APA引用形式と参照を使用してください。APAフォーマットの支援については、ラーニングリソースセンター：アカデミックライティングを参照してください。

### Japanese Learning Journal

**1. システムコールのさまざまなカテゴリについて議論し、オペレーティングシステムによって処理されるシステムコールの1つの機能を例を用いて説明してください。**

システムコールは、アプリケーションプログラムがオペレーティングシステムのカーネルと通信するためのインターフェースを提供します。これにより、プログラムはハードウェアリソースにアクセスしたり、プロセス管理を行ったりすることができます。システムコールには主に以下の5つのカテゴリがあります：

1. プロセス制御：プロセスの生成や終了、属性の設定など。例として、fork()システムコールは、新しいプロセスを生成します。
2. ファイル操作：ファイルの読み書き、作成、削除など。open()システムコールは、ファイルを開くために使用されます。
3. デバイス管理：デバイスの読み書き、設定など。ioctl()システムコールは、デバイスの特定の操作を実行するために使われます。
4. 情報維持：システムの情報を取得する。getpid()システムコールは、現在のプロセスのプロセスIDを取得します。
5. 通信：プロセス間通信のための機能。pipe()システムコールは、プロセス間でのデータのやり取りに使われます。

具体例として、open()システムコールを考えます。open()システムコールは、ファイルを開くために使用され、読み取り、書き込み、またはその両方を可能にします。このシステムコールはファイルディスクリプタを返し、これは開いたファイルへの参照となります。ファイルディスクリプタは、他のシステムコール（read()、write()、close()など）によってファイル操作を行うために使用されます。

以下は、C言語でのopen()システムコールの使用例です：

```c
#include <stdio.h>
#include <fcntl.h>
#include <unistd.h>

int main() {
    int fd = open("example.txt", O_RDONLY);
    if (fd == -1) {
        perror("Error opening file");
        return 1;
    }

    char buffer[100];
    ssize_t bytesRead = read(fd, buffer, sizeof(buffer) - 1);
    if (bytesRead == -1) {
        perror("Error reading file");
        close(fd);
        return 1;
    }

    buffer[bytesRead] = '\0';
    printf("File contents: %s\n", buffer);

    close(fd);
    return 0;
}
```

この例では、open()システムコールを使用して「example.txt」というファイルを読み取り専用モード（O_RDONLY）で開いています。ファイルが正常に開かれると、ファイルディスクリプタが返されます。このファイルディスクリプタを使用して、read()システムコールでファイルからバッファにデータを読み込みます。読み込み後、バッファにヌル終端を追加し、その内容を表示します。最後に、close()システムコールを使用してファイルを閉じます。

open()システムコールは、プログラムがファイルシステムと対話し、ファイルの内容を読み取るような基本的な操作を行う方法を示しています。ユーザーレベルのプログラムとオペレーティングシステムカーネルとの間のこの相互作用は、リソースの管理とハードウェアコンポーネントへの安全かつ効率的なアクセスにとって重要です。

**2. さまざまなプロセス状態を例を挙げて説明してください。なぜプロセス間の切り替えは高コストなのでしょうか？さらに、親プロセスが子プロセスの実行を停止させる状況について議論してください。**

Linuxには主に5つのプロセス状態があります：

1. Running：プロセスがCPUを使用して実行中。
2. Waiting：プロセスが何らかのリソースを待っている状態。さらに、短期待機と長期待機に分けられます。
3. Stopped：プロセスが停止され、外部からのシグナルを待っている状態。
4. Zombie：プロセスが終了したが、親プロセスがまだその終了ステータスを取得していない状態。
5. Idle：プロセスが一時的に実行を停止しているが、完全に停止していない状態。

プロセス間の切り替えが高コストである理由は、コンテキストスイッチが必要だからです。コンテキストスイッチでは、現在実行中のプロセスの状態を保存し、新しいプロセスの状態を読み込む必要があります。これにはCPUのレジスタ、メモリマップ、ファイルディスクリプタなど、多くの情報を保存および復元する必要があり、時間とリソースを消費します。
親プロセスが子プロセスの実行を停止させる状況としては、次のような場合があります：

- 子プロセスが終了した場合。例えば、exit()システムコールによって子プロセスが終了することがあります。
- 親プロセスがkillシステムコールを使用して子プロセスを終了させる場合。例えば、kill(pid, SIGTERM)で特定のプロセスを終了させることができます。
- 親プロセスがwaitシステムコールを使用して子プロセスの終了を待つ場合。これにより、親プロセスは子プロセスが終了するまで待機し、その終了ステータスを取得します。
- 子プロセスが親プロセスに依存しており、親プロセスが終了すると自動的に子プロセスも終了する場合。これは通常、親プロセスが終了すると子プロセスもシステムによってクリーンアップされるためです。

これらの例から、プロセスの管理と状態遷移がオペレーティングシステムの重要な機能であり、効率的なリソース管理とシステムの安定性に寄与していることがわかります。
