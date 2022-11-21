<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no"/>
    <script src="https://code.jquery.com/jquery-3.6.1.min.js"></script>
    <script>
        $(function () {
            $("select.detail").change(function () {
                const target = $(this).data("target");
                const option = $(this).find("option:selected");

                if (option.index() == 0)
                    $("#" + target).val("");
                else
                    $("#" + target).val(option.text());
            });
        });
    </script>
</head>
<body>
<div>
    <h3>제품 등록</h3>
    <div>
        <form method="post">
            <div>
                <h2>기본 정보</h2>
            </div>
            <div>
                <label>제품명:</label>
                <input type="text" name="productName">
            </div>

            <div>
                <label>바코드:</label>
                <input type="text" name="productBarcode">
                <button type="button">자동생성</button>
            </div>

            <hr>

            <c:set var="domainId" value="0"/>
            <c:forEach var="item" items="${list}">
            <c:if test="${item.keywordsDomainId != domainId}">
            <c:if test="${domainId != 0}">
            </select>

    </c:if>

    <c:set var="domainId" value="${item.keywordsDomainId}"/>

    <div>
        <label>${item.domainName}</label>
        <input type="text" name="${item.domainName}" id="${item.domainName}">
        <select class="detail" data-target="${item.domainName}">
            <option>직접 입력</option>
            </c:if>

            <option value="${item.keywordsId}">${item.keywordsName}</option>

            </c:forEach>

            <c:if test="${domainId != 0}">
        </select>
    </div>
    </c:if>

    <div>
        <button>등록</button>
        <a href="list">
            <button type="button">목록</button>
        </a>
    </div>
    </form>
</div>
</div>
</body>
</html>