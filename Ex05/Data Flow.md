URL:
 /bai4/products?category=chay&limit=10
        ↓
Controller:
 @RequestParam("category") → category
 @RequestParam("limit") → limit
        ↓
ModelMap:
 addAttribute("category", category)
 addAttribute("limit", limit)
 addAttribute("message", "Tìm kiếm thành công")
        ↓
View:
 /WEB-INF/views/productList.jsp
        ↓
Hiển thị:
 ${category}, ${limit}, ${message}