# GroupingAndPackingBooks
個人工具，郵政e小包分裝計算演算法練習


e小包目前重量限制 < 2000g
先抓 書本總重 < 1580

前端畫面那些之後再加吧

設計單一本書或是一群書均為一個 bookset：
class BookSet{ List<BookUnit> }

每一個BookUnit 包含 書名 集數 重量g
class BookUnit {
String bookName;
String bookEpisode;
BigDecimal weightGram;
}

嘗試試算分組 讓書能湊到指定重量內 並最少箱