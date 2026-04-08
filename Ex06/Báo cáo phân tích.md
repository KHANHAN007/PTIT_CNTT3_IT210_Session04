Bẫy dữ liệu ép kiểu
@PathVariable Long id
→ nếu truyền "abc"
→ không parse được sang Long
→ Spring ném lỗi (TypeMismatchException)

Giải pháp:

Dùng @ExceptionHandler để bắt lỗi
→ trả thông báo thân thiện