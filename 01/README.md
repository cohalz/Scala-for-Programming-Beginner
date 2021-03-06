#簡単な計算とテキストエディタの導入
前回は足し算と引き算をやりました。  
掛け算と割り算もやりましょう。
掛け算はこう書きます。  
```
2 * 3
```
結果はもちろん6です。 

続いて割り算はこう書きます。
```
7 / 2
```
結果は3.5と表示されそうですが、3と表示されます。  
整数同士の割り算は小学校でやったような整数の結果になります。

3.5と表示させたいなら、小数の形で書いてあげれば大丈夫です。
```
7.0 / 2.0
```

割った余りを表示させることも可能です。
```
8 % 3
```
8を3で割った余りということで、2が表示されます。  

小数同士でも可能です。
```
7.0 % 2.4
```
ただし、他の数字で入力するとおかしい表示になります。
```
7.3 % 2.4
```
結果はこうなります。
```
0.10000000000000009
```
0.1と表示されて欲しいところですが、何故こうなるのでしょうか？  
コンピュータでは二進数が使われているのは知っていると思います。  
例えば、十進数で「0.1」という数字を二進数に直そうとしてみましょう。  
0.00011001100…となって終わりません。  
終わらないので計算をどこかで打ち切らないと、次の計算を始めることができません。  
そのために途中で打ち切ったところで誤差が発生し、それが原因です。  
ただ、整数なら二進数に変換するときに終わらないということがないので、誤差はありません。  
出来る限り整数でできることは整数を使って、細かい結果が欲しい時に小数を使います。

##テキストエディタの導入
本格的にプログラミングをする前にSublime Text 2というテキストエディタを導入します。
###インストール方法
[http://www.sublimetext.com/2](http://www.sublimetext.com/2)からダウンロードします。

- **Windows**  
  お使いのPCのbit数を確認してダウンロードしてください。  
  portable versionではないものを選択し、指示に従ってインストールを行ってください。
  
- **Mac**  
  OS Xと書いてあるところからダウンロードします。  
  ダウンロードが完了したらdmgファイルを開き、Sublime Text 2と書かれたアイコンを、  
  ドラッグアンドドロップで隣にあるアプリケーションフォルダにコピーしてください。   
  その後アプリケーションフォルダから起動しますが、  
  [OS X Mavericks (10.9) / 開発元が未確認のため開けません･･･](http://maverick5.com/os-x-mavericks-10-9-%E9%96%8B%E7%99%BA%E5%85%83%E3%81%8C%E6%9C%AA%E7%A2%BA%E8%AA%8D%E3%81%AE%E3%81%9F%E3%82%81%E9%96%8B%E3%81%91%E3%81%BE%E3%81%9B%E3%82%93%EF%BD%A5%EF%BD%A5%EF%BD%A5-3686.html)  
  などを参考に開ける状態にしてください。  

![Sublime Text 2](img/sublimesample.png)
  
このように起動できたらメニュー上部のPreferences(MacはSublime Text 2からPreferences)をクリックし、  
次に「Settings - User」をクリックします。
![Settings - User](img/settings.png) 
  
中身を以下のコードを貼り付けて書き換えて保存します。  
```javascript
{

"font_size": 15,

"tab_size": 2

}
```
数字はお好みで調整してください。  
保存して以下のようになれば大丈夫です。(右下のTab Size:が2になっていれば保存できています)
![settings](img/settingsafter.png)

##Sublime Text2の拡張
Sublime Text2はとても拡張性が高く、扱いやすいエディタです。

拡張機能のインストールが出来るように設定をします。  
メニュー上部のViewからShow Consoleを選択すると下にコンソール画面が表示されるので、  
以下のコードを貼り付けてEnterを押します。
![showconsole](img/showconsole.png)

```
import urllib2,os,hashlib; h = '7183a2d3e96f11eeadd761d777e62404' + 'e330c659d4bb41d3bdf022e94cab3cd0'; pf = 'Package Control.sublime-package'; ipp = sublime.installed_packages_path(); os.makedirs( ipp ) if not os.path.exists(ipp) else None; urllib2.install_opener( urllib2.build_opener( urllib2.ProxyHandler()) ); by = urllib2.urlopen( 'http://sublime.wbond.net/' + pf.replace(' ', '%20')).read(); dh = hashlib.sha256(by).hexdigest(); open( os.path.join( ipp, pf), 'wb' ).write(by) if dh == h else None; print('Error validating download (got %s instead of %s), please try manual install' % (dh, h) if dh != h else 'Please restart Sublime Text to finish installation')
```

```Please restart Sublime Text to finish installation```と表示されたら、一度終了させてもう一度Sublime Text2を起動します。
Ctrl(Macはcommand)とShiftとpを同時押しすると、上にコンソールが出るので、  
![CommandPallet](img/CommandPallet.png)
  
```Install Package```と入力してEnterを押します。  
![Install Package](img/InstallPackage.png)

するとまたコンソールが出ます。
![Papackagecontrol](img/packagecontrol.png)

今度は```VintageEx```を入力します。  
![VintageEx](img/VintageEx.png)
  
これでVintageExというプラグインが導入されました。  
今後別の拡張機能を入れたい場合はCtrl+Shift+pからinstall Packageを入力することで入れることが出来ます。

また、settingsを少し変更します。  
以下のように書き換えます。
```javascript
{
  // Vim モード
  "ignored_packages": [],
  // Vim のキーバインドを使用
  "vintage_ctrl_keys": true,
  // 新規ファイルを開いたらノーマルモード
  "vintage_start_in_command_mode": true,
  
  "font_size": 15,
  "tab_size": 2
}
```
これを保存すると、Vimというテキストエディタのキー操作をSublime Text2でも使うことが出来ます。  
Vimは少ない操作でカッコの中だけを削除したり、一行コピーしたりなど、プログラミングの効率を高める事ができるエディタです。  
人気が高く、Sublime Text2やVisual Studio(VsVimという拡張があります)でも拡張してVimのキー操作を使うことが出来ます。  
Vimはモードというものがあり、iやaを押して**入力するモード**、そこから**esc**を(もしくは**Ctrlと\[を同時に**)押して**編集コマンドを打つノーマルモード**などがあります。  
**コードを書くにはiを押す**とだけ覚えれば最初は大丈夫です。  
詳しくは、以下の動画をご覧ください。  
[コーディングを3倍速くする！ Vim入門](http://vimeo.com/22709519)  
[vim入門 - ドットインストール](http://dotinstall.com/lessons/basic_vim)  
書籍としては「実践Vim」というものが非常にお勧めです。  
[実践Vim 思考のスピードで編集しよう!](http://www.amazon.co.jp/gp/product/4048916599/ref=as_li_ss_tl?ie=UTF8&camp=247&creative=7399&creativeASIN=4048916599&linkCode=as2&tag=cohalz-22)

また、ドットインストールというサイトではSublime Text2の解説動画もあります。  
[Sublime Text 2入門 - ドットインストール](http://dotinstall.com/lessons/basic_sublimetext)

##フォントを変更する
プログラミングに向いたフォントというものも存在します。  
0とO、1とIとlと区別、全角スペースの可視化など非常に便利な「Ricty Diminished」を導入します。  
以下のリンクから最新版をダウンロードします。 
[プログラミング用フォント Ricty Diminished](http://save.sys.t.u-tokyo.ac.jp/~yusa/fonts/rictydiminished.html)  
tar.gzファイルを解凍し、RictyDiminished-RegularとRictyDiminished-Boldをクリックして、インストールします。
![fontinstall](img/fontinstall.png)

インストールが終わったら、settingsを以下のように書き換えます。
```javascript
{
  // Vim モード
  "ignored_packages": [],
  // Vim のキーバインドを使用
  "vintage_ctrl_keys": true,
  // 新規ファイルを開いたらノーマルモード
  "vintage_start_in_command_mode": true,

  //フォントを変更する
  "font_face": "RictyDiminished",
  "font_size": 15,
  "tab_size": 2
}
```
保存した際に、フォントが変更されたら完了です。
####6/22追記
6/21に[@lindwurm](https://twitter.com/lindwurm)さんが、Kibitakiというプログラミング用フォントを公開しました。  
[https://github.com/Koruri/kibitaki/releases](https://github.com/Koruri/kibitaki/releases)からダウンロードが出来ます。  
Rictyとお好みで使用してください。 

Kibitaki Regularが使いたい場合は以下のようにfont_faceを変更します。  
```
"font_face": "Kibitaki"
```
Kibitaki Lightが気に入った場合は以下のように変更します。
```
"font_face": "Kibitaki-Light"
```
(ただし、Kibitakiは全角スペースの可視化がありませんので全角スペースの使用には注意してください)
##Scalaコードをファイルから実行する
今までは一行一行試していましたが、実際のプログラミングではもちろんそんな少ない行ではやりたいことは実現できません。  
いくつかのコードを組み合わせて実行するために、Scalaコードが書かれたファイルを保存します。  
拡張子は**.scala**です。

試しにSublime Text 2でFileからNew Fileと選んで新しいファイルを作ります。  
以下のコードを貼り付けます。
```
println(1 + 1)
```
Ctrlキー(Macはcommandキー)とSキーを同時に押すと、ファイル名と保存するフォルダを聞かれるので、  
ファイル名は**1.scala**で**デスクトップ**に保存します。
保存すると、1の部分の色が変わったと思いますが、  
拡張子を指定して保存するとSublime Text 2がわかりやすく色を塗ってくれたりするようになります。

ここまで来たらコマンドプロンプトやターミナルを開き、scalaを使っていない状態に戻します。  
以下のように入力してください。
```
scala> :q
```
これでscalaと入力する前の状態に戻れたと思いますので、以下のコマンドを実行します。
```
cd Desktop
```
これは今開いているフォルダの中にあるデスクトップをさらに開く動作と思っていいです。  
(エクスプローラーやFinderで開いているフォルダとは関係なく使っている黒画面のものだけに影響します。)

上記のコマンドを実行できたら、1.scalaファイルを実行します。
```
scala 1.scala
```
想像できるように2と表示されます。

今回はここまでです。次回からはもう少しプログラミングらしい部分に入っていきます。  
Sublime Text 2ですが、シェアウェアなのでたまに「買ってください！」という感じの表示が出ると思います。  
開発者のためにも、お金に余裕できたらでいいので購入するようにしましょう。

何かあれば[こちら](https://github.com/cohalz/Scala-for-Programming-Beginner/issues/new)かTwitter([@cohalz](https://twitter.com/cohalz))まで気軽にどうぞ。是非一緒に学びましょう。

次回 -> [変数とコードの変更](https://github.com/cohalz/Scala-for-Programming-Beginner/tree/master/02)

前回 -> [Scalaで始めるプログラミング入門](https://github.com/cohalz/Scala-for-Programming-Beginner) 
