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




    <div class="container">
        <div class="row row1">
            <div class="col-lg-12 headline">
                <p>前端开发方向</p>
            </div>

            <c:forEach var="vocations" items="vocationList">


            </c:forEach>


            <div class="col-lg-4 carrer1">
                <div class="headpic">
                    <div class="item1"><img class="img-responsive" src="img/head22.png"></div>
                    <div class="item2">
                        <h4>Web前端工程师</h4>
                        <p>Web前端开发工程师，主要职责是
                            利用（X）HTML/CSS/JavaScript/
                            flash等各种Web技术进行产品的开
                            发。</p>
                    </div>
                </div>
                <table class="table table-bordered table1">
                    <tbody>
                    <tr>
                        <td class="grey">门槛  <img src="img/star.png"></td>
                        <td class="grey">难易程度 <img src="img/star.png"> <img src="img/star.png"></td>
                    </tr>
                    <tr>
                        <td class="grey">成长周期<span class="red">1-3</span>年</td>
                        <td class="grey">稀缺程度<span class="red">345</span>家公司需要</td>
                    </tr>
                    <tr>
                        <th rowspan="3" class="salary">薪资待遇</th>
                        <td class="money"><span>0-1年</span><span>5k-10k/月</span></td>
                    </tr>
                    <tr>
                        <td class="money3"><span>1-3年</span><span>10k-20k/月</span></td>
                    </tr>
                    <tr>
                        <td class="money2"><span>3-5年</span><span>20k-50k/月</span></td>
                    </tr>
                    <tr>
                        <th colspan="2">有<span class="red1">286人</span>在学</th>
                    </tr>
                    <tr>
                        <th colspan="2" class="youneed"><p>提示:在你学习之前你应该已经掌握XXXXX、XXXXX、XX等语言基础</p></th>
                    </tr>
                    </tbody>
                </table>
            </div>

            <div class="col-lg-4 carrer1">
                <div class="headpic">
                    <div class="item1"><img class="img-responsive" src="img/head22.png"></div>
                    <div class="item2">
                        <h4>Web前端工程师</h4>
                        <p>Web前端开发工程师，主要职责是
                            利用（X）HTML/CSS/JavaScript/
                            flash等各种Web技术进行产品的开
                            发。</p>
                    </div>
                </div>
                <table class="table table-bordered table1">
                    <tbody>
                    <tr>
                        <td class="grey">门槛  <img src="img/star.png"></td>
                        <td class="grey">难易程度 <img src="img/star.png"> <img src="img/star.png"></td>
                    </tr>
                    <tr>
                        <td class="grey">成长周期<span class="red">1-3</span>年</td>
                        <td class="grey">稀缺程度<span class="red">345</span>家公司需要</td>
                    </tr>
                    <tr>
                        <th rowspan="3" class="salary">薪资待遇</th>
                        <td class="money"><span>0-1年</span><span>5k-10k/月</span></td>
                    </tr>
                    <tr>
                        <td class="money3"><span>1-3年</span><span>10k-20k/月</span></td>
                    </tr>
                    <tr>
                        <td class="money2"><span>3-5年</span><span>20k-50k/月</span></td>
                    </tr>
                    <tr>
                        <th colspan="2">有<span class="red1">286人</span>在学</th>
                    </tr>
                    <tr>
                        <th colspan="2" class="youneed"><p>提示:在你学习之前你应该已经掌握XXXXX、XXXXX、XX等语言基础</p></th>
                    </tr>
                    </tbody>
                </table>
                <div class="transparent">
                    <p>IOS工程师</p>
                    <p>iOS是由苹果公司开发的移动操作统，iOS与苹果的Mac OS X操作系统一样，也是以Darwin为基础的，因此同样属
                        于类Unix的商业操作系统。国内iOS开
                        发起步相对较晚，人才培养机制更是远
                        远跟不上市场发展速度。有限的iOS开
                        发人才成了国内企业必争的资源。国内  iOS开发起步相对较晚，人才培养机制
                        更是远远跟不上市场发展速度。有限的iOS开发人才成了国内企业必争的资源。</p>
                </div>
            </div>

            <div class="col-lg-4 carrer2">
                <div class="headpic">
                    <div class="item1"><img class="img-responsive" src="img/head22.png"></div>
                    <div class="item2">
                        <h4>Web前端工程师</h4>
                        <p>Web前端开发工程师，主要职责是
                            利用（X）HTML/CSS/JavaScript/
                            flash等各种Web技术进行产品的开
                            发。</p>
                    </div>
                </div>
                <table class="table table-bordered table1">
                    <tbody>
                    <tr>
                        <td class="grey">门槛  <img src="img/star.png"></td>
                        <td class="grey">难易程度 <img src="img/star.png"> <img src="img/star.png"></td>
                    </tr>
                    <tr>
                        <td class="grey">成长周期<span class="red">1-3</span>年</td>
                        <td class="grey">稀缺程度<span class="red">345</span>家公司需要</td>
                    </tr>
                    <tr>
                        <th rowspan="3" class="salary">薪资待遇</th>
                        <td class="money"><span>0-1年</span><span>5k-10k/月</span></td>
                    </tr>
                    <tr>
                        <td class="money3"><span>1-3年</span><span>10k-20k/月</span></td>
                    </tr>
                    <tr>
                        <td class="money2"><span>3-5年</span><span>20k-50k/月</span></td>
                    </tr>
                    <tr>
                        <th colspan="2">有<span class="red1">286人</span>在学</th>
                    </tr>
                    <tr>
                        <th colspan="2" class="youneed"><p>提示:在你学习之前你应该已经掌握XXXXX、XXXXX、XX等语言基础</p></th>
                    </tr>
                    </tbody>
                </table>
            </div>

            <div class="col-lg-12 headline">
                后端开发方向
            </div>
            <div class="col-lg-4 carrer1">
                <div class="headpic">
                    <div class="item1"><img class="img-responsive" src="img/head22.png"></div>
                    <div class="item2">
                        <h4>Web前端工程师</h4>
                        <p>Web前端开发工程师，主要职责是
                            利用（X）HTML/CSS/JavaScript/
                            flash等各种Web技术进行产品的开
                            发。</p>
                    </div>
                </div>
                <table class="table table-bordered table1">
                    <tbody>
                    <tr>
                        <td class="grey">门槛  <img src="img/star.png"></td>
                        <td class="grey">难易程度 <img src="img/star.png"> <img src="img/star.png"></td>
                    </tr>
                    <tr>
                        <td class="grey">成长周期<span class="red">1-3</span>年</td>
                        <td class="grey">稀缺程度<span class="red">345</span>家公司需要</td>
                    </tr>
                    <tr>
                        <th rowspan="3" class="salary">薪资待遇</th>
                        <td class="money"><span>0-1年</span><span>5k-10k/月</span></td>
                    </tr>
                    <tr>
                        <td class="money3"><span>1-3年</span><span>10k-20k/月</span></td>
                    </tr>
                    <tr>
                        <td class="money2"><span>3-5年</span><span>20k-50k/月</span></td>
                    </tr>
                    <tr>
                        <th colspan="2">有<span class="red1">286人</span>在学</th>
                    </tr>
                    <tr>
                        <th colspan="2" class="youneed"><p>提示:在你学习之前你应该已经掌握XXXXX、XXXXX、XX等语言基础</p></th>
                    </tr>
                    </tbody>
                </table>
            </div>
            <div class="col-lg-4 carrer1">
                <div class="headpic">
                    <div class="item1"><img class="img-responsive" src="img/head22.png"></div>
                    <div class="item2">
                        <h4>Web前端工程师</h4>
                        <p>Web前端开发工程师，主要职责是
                            利用（X）HTML/CSS/JavaScript/
                            flash等各种Web技术进行产品的开
                            发。</p>
                    </div>
                </div>
                <table class="table table-bordered table1">
                    <tbody>
                    <tr>
                        <td class="grey">门槛  <img src="img/star.png"></td>
                        <td class="grey">难易程度 <img src="img/star.png"> <img src="img/star.png"></td>
                    </tr>
                    <tr>
                        <td class="grey">成长周期<span class="red">1-3</span>年</td>
                        <td class="grey">稀缺程度<span class="red">345</span>家公司需要</td>
                    </tr>
                    <tr>
                        <th rowspan="3" class="salary">薪资待遇</th>
                        <td class="money"><span>0-1年</span><span>5k-10k/月</span></td>
                    </tr>
                    <tr>
                        <td class="money3"><span>1-3年</span><span>10k-20k/月</span></td>
                    </tr>
                    <tr>
                        <td class="money2"><span>3-5年</span><span>20k-50k/月</span></td>
                    </tr>
                    <tr>
                        <th colspan="2">有<span class="red1">286人</span>在学</th>
                    </tr>
                    <tr>
                        <th colspan="2" class="youneed"><p>提示:在你学习之前你应该已经掌握XXXXX、XXXXX、XX等语言基础</p></th>
                    </tr>
                    </tbody>
                </table>
            </div>
            <div class="col-lg-4 carrer2">
                <div class="headpic">
                    <div class="item1"><img class="img-responsive" src="img/head22.png"></div>
                    <div class="item2">
                        <h4>Web前端工程师</h4>
                        <p>Web前端开发工程师，主要职责是
                            利用（X）HTML/CSS/JavaScript/
                            flash等各种Web技术进行产品的开
                            发。</p>
                    </div>
                </div>
                <table class="table table-bordered table1">
                    <tbody>
                    <tr>
                        <td class="grey">门槛  <img src="img/star.png"></td>
                        <td class="grey">难易程度 <img src="img/star.png"> <img src="img/star.png"></td>
                    </tr>
                    <tr>
                        <td class="grey">成长周期<span class="red">1-3</span>年</td>
                        <td class="grey">稀缺程度<span class="red">345</span>家公司需要</td>
                    </tr>
                    <tr>
                        <th rowspan="3" class="salary">薪资待遇</th>
                        <td class="money"><span>0-1年</span><span>5k-10k/月</span></td>
                    </tr>
                    <tr>
                        <td class="money3"><span>1-3年</span><span>10k-20k/月</span></td>
                    </tr>
                    <tr>
                        <td class="money2"><span>3-5年</span><span>20k-50k/月</span></td>
                    </tr>
                    <tr>
                        <th colspan="2">有<span class="red1">286人</span>在学</th>
                    </tr>
                    <tr>
                        <th colspan="2" class="youneed"><p>提示:在你学习之前你应该已经掌握XXXXX、XXXXX、XX等语言基础</p></th>
                    </tr>
                    </tbody>
                </table>
            </div>
            <div class="col-lg-4 carrer1">
                <div class="headpic">
                    <div class="item1"><img class="img-responsive" src="img/head22.png"></div>
                    <div class="item2">
                        <h4>Web前端工程师</h4>
                        <p>Web前端开发工程师，主要职责是
                            利用（X）HTML/CSS/JavaScript/
                            flash等各种Web技术进行产品的开
                            发。</p>
                    </div>
                </div>
                <table class="table table-bordered table1">
                    <tbody>
                    <tr>
                        <td class="grey">门槛  <img src="img/star.png"></td>
                        <td class="grey">难易程度 <img src="img/star.png"> <img src="img/star.png"></td>
                    </tr>
                    <tr>
                        <td class="grey">成长周期<span class="red">1-3</span>年</td>
                        <td class="grey">稀缺程度<span class="red">345</span>家公司需要</td>
                    </tr>
                    <tr>
                        <th rowspan="3" class="salary">薪资待遇</th>
                        <td class="money"><span>0-1年</span><span>5k-10k/月</span></td>
                    </tr>
                    <tr>
                        <td class="money3"><span>1-3年</span><span>10k-20k/月</span></td>
                    </tr>
                    <tr>
                        <td class="money2"><span>3-5年</span><span>20k-50k/月</span></td>
                    </tr>
                    <tr>
                        <th colspan="2">有<span class="red1">286人</span>在学</th>
                    </tr>
                    <tr>
                        <th colspan="2" class="youneed"><p>提示:在你学习之前你应该已经掌握XXXXX、XXXXX、XX等语言基础</p></th>
                    </tr>
                    </tbody>
                </table>
            </div>
            <div class="col-lg-4 carrer1">
                <div class="headpic">
                    <div class="item1"><img class="img-responsive" src="img/head22.png"></div>
                    <div class="item2">
                        <h4>Web前端工程师</h4>
                        <p>Web前端开发工程师，主要职责是
                            利用（X）HTML/CSS/JavaScript/
                            flash等各种Web技术进行产品的开
                            发。</p>
                    </div>
                </div>
                <table class="table table-bordered table1">
                    <tbody>
                    <tr>
                        <td class="grey">门槛  <img src="img/star.png"></td>
                        <td class="grey">难易程度 <img src="img/star.png"> <img src="img/star.png"></td>
                    </tr>
                    <tr>
                        <td class="grey">成长周期<span class="red">1-3</span>年</td>
                        <td class="grey">稀缺程度<span class="red">345</span>家公司需要</td>
                    </tr>
                    <tr>
                        <th rowspan="3" class="salary">薪资待遇</th>
                        <td class="money"><span>0-1年</span><span>5k-10k/月</span></td>
                    </tr>
                    <tr>
                        <td class="money3"><span>1-3年</span><span>10k-20k/月</span></td>
                    </tr>
                    <tr>
                        <td class="money2"><span>3-5年</span><span>20k-50k/月</span></td>
                    </tr>
                    <tr>
                        <th colspan="2">有<span class="red1">286人</span>在学</th>
                    </tr>
                    <tr>
                        <th colspan="2" class="youneed"><p>提示:在你学习之前你应该已经掌握XXXXX、XXXXX、XX等语言基础</p></th>
                    </tr>
                    </tbody>
                </table>
            </div>
            <div class="col-lg-12 headline">
                Python开发方向
            </div>
            <div class="col-lg-4 carrer1">
                <div class="headpic">
                    <div class="item1"><img class="img-responsive" src="img/head22.png"></div>
                    <div class="item2">
                        <h4>Web前端工程师</h4>
                        <p>Web前端开发工程师，主要职责是
                            利用（X）HTML/CSS/JavaScript/
                            flash等各种Web技术进行产品的开
                            发。</p>
                    </div>
                </div>
                <table class="table table-bordered table1">
                    <tbody>
                    <tr>
                        <td class="grey">门槛  <img src="img/star.png"></td>
                        <td class="grey">难易程度 <img src="img/star.png"> <img src="img/star.png"></td>
                    </tr>
                    <tr>
                        <td class="grey">成长周期<span class="red">1-3</span>年</td>
                        <td class="grey">稀缺程度<span class="red">345</span>家公司需要</td>
                    </tr>
                    <tr>
                        <th rowspan="3" class="salary">薪资待遇</th>
                        <td class="money"><span>0-1年</span><span>5k-10k/月</span></td>
                    </tr>
                    <tr>
                        <td class="money3"><span>1-3年</span><span>10k-20k/月</span></td>
                    </tr>
                    <tr>
                        <td class="money2"><span>3-5年</span><span>20k-50k/月</span></td>
                    </tr>
                    <tr>
                        <th colspan="2">有<span class="red1">286人</span>在学</th>
                    </tr>
                    <tr>
                        <th colspan="2" class="youneed"><p>提示:在你学习之前你应该已经掌握XXXXX、XXXXX、XX等语言基础</p></th>
                    </tr>
                    </tbody>
                </table>
            </div>
            <div class="col-lg-4 carrer1">
                <div class="headpic">
                    <div class="item1"><img class="img-responsive" src="img/head22.png"></div>
                    <div class="item2">
                        <h4>Web前端工程师</h4>
                        <p>Web前端开发工程师，主要职责是
                            利用（X）HTML/CSS/JavaScript/
                            flash等各种Web技术进行产品的开
                            发。</p>
                    </div>
                </div>
                <table class="table table-bordered table1">
                    <tbody>
                    <tr>
                        <td class="grey">门槛  <img src="img/star.png"></td>
                        <td class="grey">难易程度 <img src="img/star.png"> <img src="img/star.png"></td>
                    </tr>
                    <tr>
                        <td class="grey">成长周期<span class="red">1-3</span>年</td>
                        <td class="grey">稀缺程度<span class="red">345</span>家公司需要</td>
                    </tr>
                    <tr>
                        <th rowspan="3" class="salary">薪资待遇</th>
                        <td class="money"><span>0-1年</span><span>5k-10k/月</span></td>
                    </tr>
                    <tr>
                        <td class="money3"><span>1-3年</span><span>10k-20k/月</span></td>
                    </tr>
                    <tr>
                        <td class="money2"><span>3-5年</span><span>20k-50k/月</span></td>
                    </tr>
                    <tr>
                        <th colspan="2">有<span class="red1">286人</span>在学</th>
                    </tr>
                    <tr>
                        <th colspan="2" class="youneed"><p>提示:在你学习之前你应该已经掌握XXXXX、XXXXX、XX等语言基础</p></th>
                    </tr>
                    </tbody>
                </table>
            </div>
            <div class="col-lg-4 carrer2">
                <div class="headpic">
                    <div class="item1"><img class="img-responsive" src="img/head22.png"></div>
                    <div class="item2">
                        <h4>Web前端工程师</h4>
                        <p>Web前端开发工程师，主要职责是
                            利用（X）HTML/CSS/JavaScript/
                            flash等各种Web技术进行产品的开
                            发。</p>
                    </div>
                </div>
                <table class="table table-bordered table1">
                    <tbody>
                    <tr>
                        <td class="grey">门槛  <img src="img/star.png"></td>
                        <td class="grey">难易程度 <img src="img/star.png"> <img src="img/star.png"></td>
                    </tr>
                    <tr>
                        <td class="grey">成长周期<span class="red">1-3</span>年</td>
                        <td class="grey">稀缺程度<span class="red">345</span>家公司需要</td>
                    </tr>
                    <tr>
                        <th rowspan="3" class="salary">薪资待遇</th>
                        <td class="money"><span>0-1年</span><span>5k-10k/月</span></td>
                    </tr>
                    <tr>
                        <td class="money3"><span>1-3年</span><span>10k-20k/月</span></td>
                    </tr>
                    <tr>
                        <td class="money2"><span>3-5年</span><span>20k-50k/月</span></td>
                    </tr>
                    <tr>
                        <th colspan="2">有<span class="red1">286人</span>在学</th>
                    </tr>
                    <tr>
                        <th colspan="2" class="youneed"><p>提示:在你学习之前你应该已经掌握XXXXX、XXXXX、XX等语言基础</p></th>
                    </tr>
                    </tbody>
                </table>
            </div>
            <div class="col-lg-12 headline">
                运维方向
            </div>
            <div class="col-lg-4 carrer1">
                <div class="headpic">
                    <div class="item1"><img class="img-responsive" src="img/head22.png"></div>
                    <div class="item2">
                        <h4>Web前端工程师</h4>
                        <p>Web前端开发工程师，主要职责是
                            利用（X）HTML/CSS/JavaScript/
                            flash等各种Web技术进行产品的开
                            发。</p>
                    </div>
                </div>
                <table class="table table-bordered table1">
                    <tbody>
                    <tr>
                        <td class="grey">门槛  <img src="img/star.png"></td>
                        <td class="grey">难易程度 <img src="img/star.png"> <img src="img/star.png"></td>
                    </tr>
                    <tr>
                        <td class="grey">成长周期<span class="red">1-3</span>年</td>
                        <td class="grey">稀缺程度<span class="red">345</span>家公司需要</td>
                    </tr>
                    <tr>
                        <th rowspan="3" class="salary">薪资待遇</th>
                        <td class="money"><span>0-1年</span><span>5k-10k/月</span></td>
                    </tr>
                    <tr>
                        <td class="money3"><span>1-3年</span><span>10k-20k/月</span></td>
                    </tr>
                    <tr>
                        <td class="money2"><span>3-5年</span><span>20k-50k/月</span></td>
                    </tr>
                    <tr>
                        <th colspan="2">有<span class="red1">286人</span>在学</th>
                    </tr>
                    <tr>
                        <th colspan="2" class="youneed"><p>提示:在你学习之前你应该已经掌握XXXXX、XXXXX、XX等语言基础</p></th>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div>




    </div>
</main>