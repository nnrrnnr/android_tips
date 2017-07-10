# Reference
- http://techlife.cookpad.com/entry/2016/05/17/115024
- http://techlife.cookpad.com/entry/android-resource-policy

# Policy
- 本当に汎用的に使える部分のみ汎用リソースとして定義する
    - 汎用リソースは記述ファイル名、命名規則などで容易に判別可能にする
    - 将来的に汎用にできるかも…などの曖昧な根拠で汎用リソースにしない
- 汎用リソースで表現できないものに関しては「画面ごとのリソース」として定義する
    - 画面ごとのリソースは記述ファイル名、命名規則などで適用範囲を判別可能にする
    - 他の「画面ごとのリソース」と同じ定義をしようとしている場合、そのリソースの汎用リソース化を検討する

## Color

1. 実装上の制限がない限り、色の指定は Color リソースを参照させる
2. アプリ内で多用される基本的な色には orange 、 green などの汎用的な名前をつける
3. 各色については用途別に名前をつける(2.で定義した色を参照しても良い)
4. ColorStateList 、gradient 用の色は名前を揃える(2.で定義した色を参照しても良い)

```
<!-- 2. で言及している基本的な色群 -->
<color name="green">#8bad00</color>
<color name="orange">#ff7f00</color>
<color name="red">#ef6074</color>

<!-- 3. で言及している用途別の色群 -->
<color name="recipe">@color/green</color>
<color name="ranking_arrow_up">@color/orange</color>
<color name="ranking_arrow_stay">#b8af93</color>
<color name="ranking_arrow_down">#32a9c0</color>

<!-- 4. で言及している用途別の色群 -->
<color name="button_background_primary">@color/orange</color>
<color name="button_background_primary_pressed">#da6e00</color>
<color name="button_background_primary_disabled">#ffc17d</color>
<color name="button_text_primary">@color/white</color>
<color name="button_text_primary_pressed">#d9d9d9</color>
<color name="button_text_primary_disabled">#ffe5c9</color>
```

## Dimen

1. 実装上の制限がない限りサイズ指定は Dimen リソースを参照させる
2. アプリ全体で利用する Dimen の基本単位は dimens_base.xml に記述する
    - このとき定義するリソース名は dimen_xxdp とする
3. アプリ全体で利用する汎用的な定義は dimens_base.xml に記述する
    - このとき定義するリソース名は general_用途名 とする
    - 値の定義は可能な限り dimen_xxdp を参照する
4. 画面ごとの定義は dimens.xml に記述する
    - このとき定義するリソース名は 画面名_用途名 とする
    - 値の定義は可能な限り dimen_xxdp を参照する

`dimens_base.xml`
```
<!-- 2. で言及している Dimen の基本単位群 -->
<dimen name="dimen_2dp">2dp</dimen>
<dimen name="dimen_4dp">4dp</dimen>
<dimen name="dimen_8dp">8dp</dimen>
<dimen name="dimen_12dp">12dp</dimen>
<dimen name="dimen_16dp">16dp</dimen>
<dimen name="dimen_20dp">20dp</dimen>
<dimen name="dimen_24dp">24dp</dimen>
<dimen name="dimen_32dp">32dp</dimen>
<dimen name="dimen_48dp">48dp</dimen>
<dimen name="dimen_56dp">56dp</dimen>
<dimen name="dimen_64dp">64dp</dimen>

<!-- 3. で言及している汎用的な定義 -->
<dimen name="general_padding">@dimen/dimen_12dp</dimen>
<dimen name="general_text_padding">@dimen/dimen_12dp</dimen>
<dimen name="general_card_padding">@dimen/dimen_12dp</dimen>
<dimen name="general_text_drawable_padding">@dimen/dimen_8dp</dimen>
<dimen name="general_dialog_padding">@dimen/dimen_8dp</dimen>
```
`dimens.xml`
```
<!-- 4. で言及している画面ごとの定義 -->
<dimen name="user_registration_activity_top_margin">@dimen/dimen_24dp</dimen>
<dimen name="user_registration_activity_bottom_margin">@dimen/dimen_24dp</dimen>
<dimen name="user_registration_contents_margin_top">@dimen/dimen_12dp</dimen>
<dimen name="user_registration_paragraph_margin_top">@dimen/dimen_32dp</dimen>
<dimen name="user_registration_paragraph_margin_top_small">@dimen/dimen_24dp</dimen>
```

## Style

### 再利用性を高める
Style に定義しないほうが良い
- layout_gravity
- layout_weight
- layout_above
- layout_below(など、配置に関するもの全般)

###  「parent 指定による継承」と「名前による継承」
parent指定 : 主に Android やサポートライブラリの Style を継承する場合
```
<!-- AppCompatのボタンStyle定義を継承してクックパッドのボタンStyle定義を行う例 -->
<style name="CookpadStyle.General.Button" parent="Widget.AppCompat.Button">
    <item name="android:background">@drawable/button_background_default</item>
    <item name="android:textAppearance">@style/CookpadFont.General.Button.Text</item>
    <item name="android:paddingTop">@dimen/button_padding_vertical</item>
    <item name="android:paddingBottom">@dimen/button_padding_vertical</item>
    <item name="android:paddingLeft">@dimen/button_padding_horizontal</item>
    <item name="android:paddingRight">@dimen/button_padding_horizontal</item>
    <item name="android:drawablePadding">@dimen/button_drawable_padding</item>
    <item name="android:minWidth">@dimen/button_min_width</item>
    <item name="android:minHeight">@dimen/button_min_height</item>
    <item name="android:textColor">@color/button_text_state</item>
</style>
```
名前による継承 : 主に定義済みの Style のバリエーションを増やすため
```
<!-- CookpadStyle.General.Button を継承して Primaryボタン用のstyle定義を行う例 -->
<style name="CookpadStyle.General.Button.Primary">
    <item name="android:background">@drawable/button_background_primary</item>
    <item name="android:textColor">@color/button_text_primary_state</item>
</style>
```



















