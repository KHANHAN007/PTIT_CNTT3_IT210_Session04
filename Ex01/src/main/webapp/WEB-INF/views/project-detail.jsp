<%--
  Created by IntelliJ IDEA.
  User: anlinh
  Date: 8/4/26
  Time: 14:40
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<h2>Chi tiết dự án</h2>

<p>Mã: ${project.id}</p>
<p>Tên: ${project.name}</p>
<p>Mô tả: ${project.description}</p>
<p>Giám đốc: ${project.manager}</p>
<p>Ngày bắt đầu:
    <fmt:formatDate value="${project.startDate}" pattern="dd/MM/yyyy"/>
</p>
<p>Ngày kết thúc:
    <fmt:formatDate value="${project.endDate}" pattern="dd/MM/yyyy"/>
</p>
<p>Số nhân sự: ${project.totalMembers}</p>

<a href="<c:url value='/projects'/>">Quay lại</a>
