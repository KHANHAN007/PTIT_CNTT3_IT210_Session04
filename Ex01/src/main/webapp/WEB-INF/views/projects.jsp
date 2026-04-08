<%--
  Created by IntelliJ IDEA.
  User: anlinh
  Date: 8/4/26
  Time: 14:38
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<h2>Danh sách dự án</h2>

<table border="1">
  <tr>
    <th>Mã</th>
    <th>Tên</th>
    <th>Giám đốc</th>
    <th></th>
  </tr>

  <c:forEach var="p" items="${projects}">
    <tr>
      <td>${p.id}</td>
      <td>${p.name}</td>
      <td>${p.manager}</td>
      <td>
        <c:url var="detailUrl" value="/projects/detail">
          <c:param name="id" value="${p.id}" />
        </c:url>

        <a href="${detailUrl}">Chi tiết</a>    </tr>
  </c:forEach>

</table>