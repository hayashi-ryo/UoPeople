# unit6

- Introduction to Paging and Physical Memory
- Swap Memory
- File Systems
- ページングと物理メモリの紹介
- スワップメモリー
- ファイルシステム

## Goal

- By the end of this Unit, you will be able to:
  - Discuss the changes required while designing a virtual memory addressing system that maps physical memory to virtual memory.
  - Explore the file system using different methods.
- ja
  - 物理メモリを仮想メモリにマッピングする仮想メモリ・アドレッシング・システムを設計する際に必要な変更について説明しなさい。
  - さまざまな方法を使ってファイルシステムを探索する。

## Task

- [ ] Reading assignment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates  
- [x] Written assignmet
- [x] Take Self-Quiz
- [x] Take Graded-Quiz

## Reading Assignment

1. Arpaci-Dusseau, R. H., & Arpaci-Dusseau, A. C. (2018). Operating systems: three easy pieces (1.01 ed.). Arpaci-Dusseau Books. Retrieved June 16, 2022, from <https://pages.cs.wisc.edu/~remzi/OSTEP/>
  Read Virtualization: Chapter 18 – Introduction to Paging, Chapter 21 – Beyond Physical Memory: Mechanisms, Chapter 22 – Beyond Physical Memory: Policies, and Chapter 23 – Complete VM Systems.
2. Buzdar, K. (2020). What is swap memory in linux? Linux Hint. <https://linuxhint.com/swap_memory_linux/>
  Read this document on swap memory.
3. Concepts overview. (n.d.). The Linux Kernel. <https://www.kernel.org/doc/html/v5.7/admin-guide/mm/concepts.html>
  Read this document on memory management.
4. GeeksforGeeks. (2021, September 21). Paging in operating system. Retrieved July 2, 2022, from <https://www.geeksforgeeks.org/paging-in-operating-system/>
  Read this document on memory paging.
5. Gite, V. (2018, December 23). Understanding UNIX / linux file systems. Cyberciti. <https://www.cyberciti.biz/tips/understanding-unixlinux-file-system-part-i.html>
  Read this document on file systems.

## Discussion Forum

If you could design a different type of virtual memory addressing system, mapping physical memory to virtual memory, what would that look like?  Please explain what you would do differently and what you would keep the same as what is normally done.
In your responses to your peers, compare and contrast your answer to those of your peers.
Your Discussion should be a minimum of 200 words in length and not more than 500 words. Please include a word count.

あなたが異なるタイプの仮想メモリアドレスシステムを設計できるとしたら、物理メモリを仮想メモリにマッピングするシステムはどのようなものになりますか？通常行われている方法と比べて、何を違えて、何を同じにしますか？
あなたの同僚への返答では、あなたの答えと同僚の答えを比較対照してください。
ディスカッションの文章は200ワード以上500ワード以下である必要があります。ワードカウントを含めてください。

### Japanese Discussion

### 仮想メモリアドレスシステムの提案と比較

#### 導入 (Introduction)

仮想メモリは、オペレーティングシステムの基本機能の一つであり、物理メモリと仮想メモリのマッピングを通じてプログラムの実行を効率化します。ここでは、現行システムの問題点を改善するための新しいアプローチとして、ハイブリッド仮想メモリアドレスシステムを提案します。

#### 現行システムの概要 (Overview of Current System)

現在の仮想メモリアドレスシステムは主にページングを利用しています。これは物理メモリを固定サイズのページに分割し、仮想アドレスを対応する物理アドレスにマッピングします。セグメンテーションも使用され、これは論理的なメモリセグメントを用いています。

#### 提案するシステム (Proposed Virtual Memory Addressing System)

ハイブリッド仮想メモリアドレスシステムは、ページングとセグメンテーションの長所を組み合わせたものです。このシステムの特徴は以下の通りです。

1. **動的ページサイズの導入**
    - 通常の固定サイズページングの代わりに、プログラムのニーズに応じて動的にサイズを変更できるページを使用します。これにより、メモリの無駄を減らし、効率を向上させます。

2. **アドレス空間の階層化**
    - 仮想アドレス空間を複数の階層に分割し、各階層に対して異なるページング方式を適用します。これにより、大規模なアドレス空間を効率的に管理できます。

3. **キャッシュ機能の強化**
    - キャッシュメモリの活用を最適化し、よく使用されるページやセグメントを高速にアクセスできるようにします。

4. **適応型セグメンテーション**
    - プログラムの実行中に動的にセグメントを再配置し、メモリの断片化を防ぎます。これにより、メモリ利用効率を最大化します。

#### 比較と対照 (Comparison and Contrast)

ハイブリッド仮想メモリアドレスシステムと現行システムの比較を以下に示します。

- **動的ページサイズの利点**
  - メモリの無駄を減らし、特に大規模データセットを扱うプログラムで効率が向上します。一方、実装の複雑さが増す可能性があります。

- **階層化アドレス空間の利点**
  - 大規模アプリケーションのメモリ管理が容易になりますが、階層間のオーバーヘッドが発生する可能性があります。

- **強化されたキャッシュ機能の利点**
  - アクセス速度が向上し、システム全体のパフォーマンスが向上します。ただし、キャッシュの一貫性を維持するための追加のメカニズムが必要です。

- **適応型セグメンテーションの利点**
  - メモリ断片化を防ぎ、長時間稼働するシステムでのパフォーマンスを向上させますが、動的なセグメント再配置に伴うオーバーヘッドが発生する可能性があります。

#### ハイブリッドアプローチの欠点 (Drawbacks of the Hybrid Approach)

ハイブリッド仮想メモリアドレスシステムには以下の欠点があります。

1. **複雑な実装**
    - ページングとセグメンテーションの両方を統合するため、システムの設計と実装が複雑になります。これにより、開発コストとメンテナンスコストが増加する可能性があります。

2. **オーバーヘッドの増加**
    - 動的ページサイズや階層化アドレス空間の管理に伴うオーバーヘッドが発生する可能性があります。特に、リアルタイムシステムやリソース制約のある環境では、このオーバーヘッドがパフォーマンスに影響を与える可能性があります。

3. **キャッシュの一貫性維持の難しさ**
    - 強化されたキャッシュ機能の一貫性を維持するためのメカニズムが複雑になる可能性があります。これにより、システム全体のパフォーマンスが低下するリスクがあります。

#### 結論 (Conclusion)

提案したハイブリッド仮想メモリアドレスシステムは、現行システムの問題点を改善し、より効率的で柔軟なメモリ管理を提供します。しかし、複雑な実装やオーバーヘッドの増加といった欠点も考慮する必要があります。これらの欠点を克服するためのさらなる研究と開発が求められます。

#### ワードカウントの記載 (Word Count)

（ここでワードカウントを記載します）

---

この文章を基に、さらに具体的な詳細や具体例を追加して完成させることができます。具体的な要望があれば教えてください。

## Written Assignment

Use the link (<https://linuxhint.com/determine-file-system-type-linux>) and follow along to explore your file system. Choose at least two methods of exploring your file system. Take screenshots for each method and discuss what you did and noticed while exploring the file system using each method.

Note: If you do not have Linux as your main operating system, please open the Linux you installed using VirtualBox during Unit 1.

Submit the assignment in MS Word or PDF file.

You will be assessed on:

- Your ability to explore the file system using at least two methods.
- Your explanation of what you did and noticed while exploring the file system using each method.
- Organization and style of the essay (including APA formatting).

Reference

Shovon, S. (n.d.). Ways to determine the file system type in Linux. Linux Hint. <https://linuxhint.com/determine-file-system-type-linux/>

Submit a paper that is at least 2 pages in length exclusive of the reference page, double-spaced using 12-point Times New Roman font. The paper must cite a minimum of two sources in APA format and be well-written. Check all content for grammar, spelling and be sure that you have properly cited all resources (in APA format) used. Refer to the UoPeople APA Tutorials in the LRC for help with APA citations.

リンク (<https://linuxhint.com/determine-file-system-type-linux>) を使用し、ファイルシステムを探索してください。少なくとも2つの方法を選んでファイルシステムを探索し、それぞれの方法で何をしたか、何を発見したかを説明しながらスクリーンショットを撮ってください。

注意: Linuxが主なオペレーティングシステムでない場合は、ユニット1でVirtualBoxを使用してインストールしたLinuxを開いてください。

課題はMS WordまたはPDFファイルで提出してください。

評価基準:

少なくとも2つの方法でファイルシステムを探索する能力
各方法でファイルシステムを探索した際に行ったことや発見したことの説明
エッセイの構成とスタイル (APAフォーマットを含む)
参考文献

Shovon, S. (n.d.). Ways to determine the file system type in Linux. Linux Hint. <https://linuxhint.com/determine-file-system-type-linux/>

参考ページを除いて、少なくとも2ページの長さの論文を提出してください。本文は12ポイントのTimes New Romanフォントでダブルスペースにしてください。論文にはAPAフォーマットで最低2つの参考文献を引用し、よく書かれている必要があります。すべての内容について文法とスペリングを確認し、使用したすべてのリソースを適切にAPAフォーマットで引用してください。APAの引用については、LRCのUoPeople APAチュートリアルを参照してください。

### Japanese Written Assignment

### 修正後の文章

#### 1. 序論

この課題では、Linuxファイルシステムを探索するためのさまざまな方法を学び、それぞれの方法の利点と欠点を理解することを目的としています。ファイルシステムの理解は、システム管理やトラブルシューティングにおいて重要な役割を果たします。Linuxにはファイルシステムを探索するための多くのコマンドが存在し、それぞれが異なる情報を提供します。本レポートでは、"Ways to Determine the File System Type in Linux" (Shovon, n.d.) を参考に、df、lsblk、および blkid コマンドを使用してファイルシステムを探索し、その結果について分析します。

#### 2. 方法1: dfコマンド

dfコマンドは、ディスクの使用状況を表示するための基本的なツールです。`-Th` オプションを使用することで、各ファイルシステムのタイプを表示し、サイズをわかりやすく出力することが可能です。このコマンドを利用することによって、システム上のすべてのマウントポイントのディスク使用量とファイルシステムの種類を一目で確認できます。dfコマンドを実行した結果が以下となります：

```plaintext
Filesystem                        Type      Size  Used Avail Use% Mounted on
tmpfs                             tmpfs     391M  1.3M  389M   1% /run
efivarfs                          efivarfs  256K   26K  231K  10% /sys/firmware/efi/efivars
/dev/mapper/ubuntu--vg-ubuntu--lv ext4       30G  9.4G   19G  34% /
tmpfs                             tmpfs     2.0G     0  2.0G   0% /dev/shm
tmpfs                             tmpfs     5.0M  8.0K  5.0M   1% /run/lock
/dev/vda2                         ext4      2.0G  190M  1.6G  11% /boot
/dev/vda1                         vfat      1.1G  6.4M  1.1G   1% /boot/efi
tmpfs                             tmpfs     391M   12K  391M   1% /run/user/1000
share                             9p        461G  367G   94G  80% /home/ryohei/share
```

この結果によって、以下の気づきを得ることができます。

#### 気づいたポイント

1. **tmpfsファイルシステム**
   - `tmpfs` は一時ファイルシステムで、複数のマウントポイントに使用されています（例：`/run`、`/dev/shm`、`/run/lock`、`/run/user/1000`）。
   - `tmpfs` はメモリベースのファイルシステムで、RAM上に存在し、高速アクセスが可能です。メモリ容量の消費量が表示されています。
   - `/run` は `tmpfs` 上にマウントされており、1.3M 使用されているが、大部分が空きスペースです（389M 空き）。

2. **efivarfsファイルシステム**
   - `efivarfs` はEFI変数を保持するためのファイルシステムで、`/sys/firmware/efi/efivars` にマウントされています。
   - 小さなサイズ（256K）で、ほとんどが空きスペースです（231K 空き）。

3. **ルートファイルシステム**
   - `/dev/mapper/ubuntu--vg-ubuntu--lv` は主要なルートファイルシステムで、`ext4` タイプです。
   - 30G のサイズがあり、9.4G 使用されていて、約19G が空きスペースです（使用率34%）。

4. **/dev/shm**
   - `tmpfs` ファイルシステムで、サイズは2.0G、使用されていないため、すべてが空きスペースです（2.0G 空き）。

5. **/run/lock**
   - `tmpfs` ファイルシステムで、サイズは5.0M、ほとんど使用されていない（8.0K 使用、5.0M 空き）。

6. **ブートパーティション**
   - `/dev/vda2` は `ext4` ファイルシステムで、ブートパーティションとして使用されています。
   - サイズは2.0G、190M 使用されていて、1.6G が空きスペースです（使用率11%）。

7. **EFIシステムパーティション**
   - `/dev/vda1` は `vfat` ファイルシステムで、EFIシステムパーティションとして使用されています。
   - サイズは1.1G、6.4M 使用されていて、ほとんどが空きスペースです（1.1G 空き）。

8. **ユーザ固有のtmpfs**
   - `/run/user/1000` は `tmpfs` ファイルシステムで、ユーザ固有の一時ファイルシステムです。
   - サイズは391M、ほとんど使用されていない（12K 使用、391M 空き）。

9. **共有フォルダ**
   - `share` は `9p` ファイルシステムで、`/home/ryohei/share` にマウントされています。
   - サイズは461G、367G 使用されていて、94G が空きスペースです（使用率80%）。

#### まとめ

- `tmpfs` は高速アクセスを提供し、一時的なファイル保存に使用されるため、システムのパフォーマンスに寄与します。
- `efivarfs` はEFI変数の管理に使用され、ブートプロセスに関する情報を保持します。
- 主要なルートファイルシステム（`/dev/mapper/ubuntu--vg-ubuntu--lv`）は `ext4` タイプで、ディスクスペースの使用状況を適切に管理しています。
- ブートパーティションとEFIシステムパーティションは、それぞれ `ext4` と `vfat` ファイルシステムを使用しており、システムの起動に関する重要な役割を果たします。
- 共有フォルダは大容量の `9p` ファイルシステムを使用し、データの共有とアクセスを容易にしています。

#### 3. 方法2: lsblkコマンド

lsblkコマンドは、システム上のすべてのブロックデバイスの情報を表示します。`-f` オプションを使用することで、各デバイスのファイルシステムの種類やUUIDも確認できます。このコマンドは、デバイスのツリー構造を視覚的に表示するため、どのデバイスがどのパーティションに対応しているかを把握するのに役立ちます。lsblkコマンドを実行した結果が以下となります：

```plaintext
NAME                      FSTYPE      FSVER    LABEL UUID                                   FSAVAIL FSUSE% MOUNTPOINTS
sr0                                                                                                        
vda                                                                                                        
├─vda1                    vfat        FAT32          0F22-E2E0                                   1G     1% /boot/efi
├─vda2                    ext4        1.0            732844e3-5507-466b-919b-786653da7770      1.6G    10% /boot
└─vda3                    LVM2_member LVM2 001       BxRqQV-KCRU-SJsc-JLpd-IJVj-dxO7-qaRlMh                
  └─ubuntu--vg-ubuntu--lv ext4        1.0            9293ef85-16bf-46d5-9ce5-878195ad9e53     18.9G    31% /
```

この結果によって、以下の気づきを得ることができます。

#### 気づいたポイント

1. **sr0**
   - このデバイスは光学ドライブを示していますが、現在はマウントされておらず、ファイルシステムも設定されていません。

2. **vda**
   - これは仮想マシンの仮想ディスクデバイスです。具体的なパーティション情報が表示され、これらのパーティションがどのように使用されているかがわかります。

3. **vda1**
   - `vfat` ファイルシステムのパーティ

ションで、バージョンは `FAT32` です。

- UUIDは `0F22-E2E0` で、マウントポイントは `/boot/efi` です。
- 1Gの容量があり、1% 使用されています。

4. **vda2**
   - `ext4` ファイルシステムのパーティションで、バージョンは `1.0` です。
   - UUIDは `732844e3-5507-466b-919b-786653da7770` で、マウントポイントは `/boot` です。
   - 1.6G の空き容量があり、10% 使用されています。

5. **vda3**
   - `LVM2_member` ファイルシステムで、論理ボリュームマネージャ（LVM）のメンバーです。
   - UUIDは `BxRqQV-KCRU-SJsc-JLpd-IJVj-dxO7-qaRlMh` で、直接マウントポイントはありません。

6. **ubuntu--vg-ubuntu--lv**
   - `vda3` パーティション内の論理ボリュームで、`ext4` ファイルシステムを持ち、バージョンは `1.0` です。
   - UUIDは `9293ef85-16bf-46d5-9ce5-878195ad9e53` で、マウントポイントはルートディレクトリ `/` です。
   - 18.9G の空き容量があり、31% 使用されています。

#### まとめ

- **デバイスツリーの視覚的表示**: `lsblk` コマンドはデバイスのツリー構造を視覚的に表示し、どのデバイスがどのパーティションに対応しているかを一目で確認できます。特に仮想ディスクデバイス（vda）のパーティションとその構成を詳細に理解するのに役立ちます。
- **ファイルシステムの詳細情報**: 各パーティションのファイルシステムの種類、バージョン、UUID、空き容量（FSAVAIL）および使用率（FSUSE%）を表示します。これにより、各ファイルシステムの状態と使用状況を詳細に把握できます。
- **LVMの確認**: LVM（論理ボリュームマネージャ）を使用している場合、物理ボリューム（vda3）とその中の論理ボリューム（ubuntu--vg-ubuntu--lv）の関係が明確になります。
- **使用状況のモニタリング**: 各マウントポイントの使用率が分かるため、ディスクの使用状況を効率的にモニタリングでき、必要に応じて管理措置を講じることができます。

#### 4. 方法3: blkidコマンド

blkidコマンドは、ブロックデバイスの属性を詳細に表示するためのツールです。これにより、各デバイスのファイルシステムの種類、UUID、およびラベルが確認できます。blkidコマンドを実行した結果が以下となります：

```plaintext
/dev/mapper/ubuntu--vg-ubuntu--lv: UUID="9293ef85-16bf-46d5-9ce5-878195ad9e53" BLOCK_SIZE="4096" TYPE="ext4"
/dev/vda2: UUID="732844e3-5507-466b-919b-786653da7770" BLOCK_SIZE="4096" TYPE="ext4" PARTUUID="fdd426b3-6ce7-4cb5-ad5b-bc571d0be225"
/dev/vda3: UUID="BxRqQV-KCRU-SJsc-JLpd-IJVj-dxO7-qaRlMh" TYPE="LVM2_member" PARTUUID="c4df3d29-6484-47b7-9351-79938a20faae"
/dev/vda1: UUID="0F22-E2E0" BLOCK_SIZE="512" TYPE="vfat" PARTUUID="19b16908-1672-4c55-9aef-495620400714"
```

この結果によって、以下の気づきを得ることができます。

#### 気づいたポイント

1. **/dev/mapper/ubuntu--vg-ubuntu--lv**
   - **UUID**: "9293ef85-16bf-46d5-9ce5-878195ad9e53"
   - **BLOCK_SIZE**: 4096
   - **TYPE**: ext4
   - このデバイスはLVM（論理ボリュームマネージャ）の論理ボリュームを示しています。ext4ファイルシステムが使用されており、ブロックサイズは4096バイトです。UUIDにより、このボリュームがユニークに識別されます。

2. **/dev/vda2**
   - **UUID**: "732844e3-5507-466b-919b-786653da7770"
   - **BLOCK_SIZE**: 4096
   - **TYPE**: ext4
   - **PARTUUID**: "fdd426b3-6ce7-4cb5-ad5b-bc571d0be225"
   - このデバイスはext4ファイルシステムを持つパーティションで、ブロックサイズは4096バイトです。PARTUUIDはパーティションテーブル内での識別子です。

3. **/dev/vda3**
   - **UUID**: "BxRqQV-KCRU-SJsc-JLpd-IJVj-dxO7-qaRlMh"
   - **TYPE**: LVM2_member
   - **PARTUUID**: "c4df3d29-6484-47b7-9351-79938a20faae"
   - このデバイスはLVMの物理ボリュームを示しており、LVM2_memberとして認識されています。PARTUUIDはパーティションテーブル内での識別子です。ファイルシステムは存在せず、LVMのメンバーとして機能します。

4. **/dev/vda1**
   - **UUID**: "0F22-E2E0"
   - **BLOCK_SIZE**: 512
   - **TYPE**: vfat
   - **PARTUUID**: "19b16908-1672-4c55-9aef-495620400714"
   - このデバイスはvfatファイルシステムを持つパーティションで、ブロックサイズは512バイトです。PARTUUIDはパーティションテーブル内での識別子です。通常、EFIシステムパーティションとして使用されます。

#### まとめ

- **UUID**と**PARTUUID**: `blkid` コマンドは各デバイスのUUIDとPARTUUIDを表示し、これによりデバイスをユニークに識別できます。UUIDはファイルシステムレベルでの識別子であり、PARTUUIDはパーティションテーブルレベルでの識別子です。
- **ファイルシステムの種類**: 各デバイスのファイルシステムの種類（ext4、vfat、LVM2_member）が表示され、どのファイルシステムが使用されているかを明確にします。
- **ブロックサイズ**: 各ファイルシステムのブロックサイズも表示され、データの読み書きにおける最小単位が分かります。これにより、ファイルシステムのパフォーマンス特性を理解するのに役立ちます。
- **LVMの利用**: LVM2_memberとして認識されるデバイスがあり、LVMの論理ボリューム管理が行われていることが確認できます。これにより、柔軟なストレージ管理が可能です。

### 5. 結論

本レポートでは、df、lsblk、およびblkidコマンドを使用してLinuxファイルシステムを探索し、その結果を分析しました。それぞれのコマンドは異なる情報を提供し、システム管理者がファイルシステムの状態を詳細に把握するための有用なツールです。

- **dfコマンド**: ディスク使用量とファイルシステムの種類を一目で確認でき、特にシステム全体のディスク使用状況を監視するのに適しています。
- **lsblkコマンド**: デバイスのツリー構造を視覚的に表示し、各デバイスのファイルシステムの種類やUUIDを詳細に確認でき、ストレージデバイスの管理に役立ちます。
- **blkidコマンド**: 各デバイスの詳細な属性情報（UUID、ファイルシ

ステムの種類、ブロックサイズ）を提供し、特定のデバイスの識別や管理に役立ちます。

それぞれの方法には特有の利点があり、システムの状態やニーズに応じて使い分けることが重要です。全体として、これらのツールを使用することで、Linuxシステムのファイルシステムを効果的に管理し、最適化するための強力な手段を得ることができました。
