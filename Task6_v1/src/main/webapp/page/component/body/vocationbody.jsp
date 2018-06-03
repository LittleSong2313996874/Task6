<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="songshang" uri="http://LittleSong/demo/1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<main>
    <div class="slidebar">
        <div class="firstpage">首页>
            <span class="carrer">职业</span></div>
        <ol class="breadcrumb comb1">
            <li class="direction">方向:</li>
            <li><a href="#">全部</a></li>
            <li><a href="#">前端开发</a></li>
            <li><a href="#">后端开发</a></li>
            <li><a href="#">Python开发</a></li>
            <li><a href="#">产品经理</a></li>
            <li><a href="#">运营维护</a></li>
        </ol>
    </div>


 <c:forEach var="vocation" items="${vocationList}">

    <div class="container">
            <div class="row row1">

                <div class="col-lg-12 headline">
                    <p>${vocation.field}</p>
                </div>

                <c:forEach begin="1" end="3">

                    <div class="col-lg-4 carrer1">
                        <div class="headpic">
                            <div class="item1"><img class="img-responsive" src="img/head22.png"></div>
                            <div class="item2">
                                <h4>${vocation.NAME}</h4>
                                <p>${vocation.summary}</p>
                            </div>
                        </div>
                        <table class="table table-bordered table1">
                            <tbody>
                            <tr>
                                <td class="grey">门槛
                                    <c:forEach begin="1" end="${vocation.threshold}">
                                        <img src="img/star.png">
                                    </c:forEach>
                                </td>
                                <td class="grey">难易程度

                                    <c:forEach begin="1" end="${vocation.difficulty_Level}">
                                        <img src="img/star.png">
                                    </c:forEach>

                                </td>
                            </tr>
                            <tr>
                                <td class="grey">成长周期<span class="red">${vocation.growth_cycle}</span>年</td>
                                <td class="grey">稀缺程度<span class="red">${vocation.rareness}</span>家公司需要</td>
                            </tr>
                            <tr>
                                <th rowspan="3" class="salary">薪资待遇</th>
                                <td class="money"><span>0-1年</span><span>${vocation.salary_first}</span></td>
                            </tr>
                            <tr>
                                <td class="money3"><span>1-3年</span><span>${vocation.salary_second}</span></td>
                            </tr>
                            <tr>
                                <td class="money2"><span>3-5年</span><span>${vocation.salary_third}</span></td>
                            </tr>
                            <tr>
                                <th colspan="2">有<span class="red1">${vocation.number}人</span>在学</th>
                            </tr>
                            <tr>
                                <th colspan="2" class="youneed"><p>提示:在你学习之前你应该已经拥有${vocation.basic_knowledge}等领域的基础</p></th>
                            </tr>
                            </tbody>
                        </table>
                        <%--<div class="transparent">
                            <p style="font-size: 20px">IOS工程师</p>
                            <br/>
                            <br/>
                            <br/>
                            <p style="font-size: 40px">FUCK YOU</p>
                        </div>--%>
                    </div>


                </c:forEach>

        </div>

    </div>

</c:forEach>

</main>