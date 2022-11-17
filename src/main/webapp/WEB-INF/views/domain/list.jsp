<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Student
  Date: 2022-11-15
  Time: 오전 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
</head>
<body>
<div class="container">

    <h1>용어 목록</h1>

    <div>
        <form>
            <div>
                <select name="search">
                    <option value="1">용어 번호</option>
                    <option value="2">용어</option>
                </select>
            </div>
            <div>
                <input type="text" name="keyword">
            </div>
            <div>
                <button>검색</button>
            </div>
        </form>
    </div>

    <table class="table">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">Name</th>
            <th scope="col">Control</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="domain" items="${domain}" varStatus="status">
            <tr>
                <th scope="row">${domain.domainId}</th>
                <td>${domain.domainName}</td>
                <td>
                    <a href="/keywords/${domain.domainId}/list">용어관리</a>
                    <a href="update/${domain.domainId}" class="btn btn-sm btn-secondary ms-1">수정</a>
                    <a href="delete/${domain.domainId}" class="btn btn-sm btn-danger">삭제</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <div class="pagination-wrap mt-5 d-flex justify-content-center" data-aos="fade-in" data-aos-delay="100">
        <nav aria-label="Page navigation">
            <ul class="pagination">
                <li class="page-item"><a class="page-link" href="?page=1&langname=angular">처음</a></li>
                <li class="page-item">
                    <a class="page-link" href="?page=${pager.prev}&langname=angular" aria-label="Previous">
                        <span aria-hidden="true">&laquo;</span>
                    </a>
                </li>
                <c:forEach var="page" items="${pager.list}">
                    <li class="page-item">
                        <a class="page-link ${page eq pager.page ? 'active' : ''}"
                           href="?page=${page}&langname=angular">${page}</a>
                    </li>
                </c:forEach>
                <li class="page-item">
                    <a class="page-link" href="?page=${pager.next}&langname=angular" aria-label="Next">
                        <span aria-hidden="true">&raquo;</span>
                    </a>
                </li>
                <li class="page-item">
                    <a class="page-link" href="?page=${pager.last}&langname=angular">마지막</a>
                </li>
            </ul>
        </nav>
    </div>
    <div class="d-flex justify-content-center">
        <a href="add" class="btn btn-secondary me-1">추가</a>
        <a href="../" class="btn btn-secondary ms-1 me-3">뒤로</a>
    </div>
</div>

<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
        crossorigin="anonymous"></script>
</body>
</html>