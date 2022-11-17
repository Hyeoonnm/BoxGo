<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <div class="mb-3">
        <h1>제품등록</h1>
    </div>
    <form class="form-floating" method="post">
        <div class="mb-3">
            <label for="floatingInputValue">제품명
                <input type="text" name="productName" class="form-control" id="floatingInputValue"
                       placeholder="제품명을 입력해주세요.">
            </label>
        </div>
        <div class="">
            <label for="floatingInputValue6">바코드
                <input type="text" name="productBarcode" class="form-control" id="floatingInputValue6"
                       placeholder="제품명을 입력해주세요.">
            </label>
            <button type="button">자동생성</button>
        </div>
        <div class="mb-3">
            <label for="floatingInputValue1">카테고리
                <input type="text" name="detailCategory" class="form-control" id="floatingInputValue1"
                       placeholder="카테고리를 입력해주세요.">

            <select id="detailCategory">
                <option>직접입력</option>
                <c:forEach items="${categorys}" var="categorys">
                    <option value="${categorys.keywordsId}">${categorys.keywordsName}</option>
                </c:forEach>
            </select>
            </label>
        </div>
        <div class="mb-3">
            <label for="floatingInputValue3">브랜드
                <input type="text" name="detailBrand" class="form-control" id="floatingInputValue3"
                       placeholder="브랜드를 입력해주세요.">
                <select id="detailBrand">

                    <option>직접입력</option>
                    <c:forEach items="${brands}" var="brands">
                        <option value="${brands.keywordsId}">${brands.keywordsName}</option>
                    </c:forEach>
                </select>
            </label>
        </div>
        <div class="mb-3">
            <label for="floatingInputValue4">사이즈
                <input type="text" name="detailSize" class="form-control" id="floatingInputValue4"
                       placeholder="사이즈를 입력해주세요.">
                <select id="detailSize">
                    <option>직접입력</option>
                    <c:forEach items="${sizes}" var="sizes">
                        <option value="${sizes.keywordsId}">${sizes.keywordsName}</option>
                    </c:forEach>
                </select>
            </label>
        </div>
        <div class="mb-3">
            <label for="floatingInputValue5">색깔
                <input type="text" name="detailColor" class="form-control" id="floatingInputValue5"
                       placeholder="색깔 입력해주세요.">
                <select id="detailColor">
                    <option>직접입력</option>
                    <c:forEach items="${colors}" var="colors">
                        <option value="${colors.keywordsId}">${colors.keywordsName}</option>
                    </c:forEach>
                </select>
            </label>
        </div>
        <button class="mt-2 btn btn-primary">submit</button>
        <a href="list" class="mt-2 btn btn-danger">back</a>
    </form>
</div>
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
        crossorigin="anonymous"></script>
</body>
</html>