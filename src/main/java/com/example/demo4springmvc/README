1. 環境配置
使用 XML 和 properties 檔來設定與 MySQL 的連線。

2. 建立資料庫及類別
建立 `StudentController`、`StudentDao`、`StudentService`、`Student`、`StudentRowMapper` 類別。

3. Student.class
創建 `Student` 的資料結構，並用 `get` 和 `set` 方法進行封裝。

4. StudentDao.class
注入一個 `NamedParameterJdbcTemplate` 來簡化 SQL 操作。

建立 `getById` 方法，執行 SQL 指令使用 `studentId` 查詢學生資料。在 `getById` 方法內，創建一個 Map 來放 SQL 的變數 `studentId`，並將這個 Map 傳入 SQL 查詢。

5. StudentRowMapper.class
創建一個類別，實作 `RowMapper` 介面，將資料庫查詢的結果轉換為 Java 的 `Student` 物件，並作為 `query()` 方法中的第三個參數。

6. StudentService.class
定義一個 `StudentDao` 來呼叫 Dao 層的 `getById` 方法來取得參數。創建一個方法來傳遞從 Dao 取得的參數，這裡是設計商業邏輯的地方。

7. StudentController.class
定義一個 `StudentService` 來呼叫 Service 層的 `getById` 方法來取得參數。創建一個 `select()` 方法，使用 `@GetMapping` 和 `@PathVariable` 與前端溝通。

8. API Tester 測試
前端使用 GET 請求來查詢，在 URL 中使用 `@GetMapping` 裡的路徑來獲得所需的物件。
