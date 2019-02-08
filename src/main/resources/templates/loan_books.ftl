<!doctype html>
<html lang="en">
<head>
    <#include "partials/head.ftl">

    <title>Manage Books</title>

</head>

<body>
<nav class="navbar navbar-dark fixed-top bg-dark flex-md-nowrap p-0 shadow">
    <a class="navbar-brand col-sm-3 col-md-2 mr-0" href="/">Librarian Homepage</a>
    <div class="navbar-right">
    </div>



</nav>
<div class="container-fluid mt-5">
    <div class="row">
        <#include "partials/navbar.ftl">
        <main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-4">
            <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
                <h1 class="h2">Manage Books</h1>
            </div>
            <div class="table-responsive">
                <table class="table table-striped table-sm">
                    <thead>
                    <tr>
                        <th>Book Name</th>
                        <th>Copies Available</th>
                        <th>Users</th>
                        <th>Action</th>
                    </tr>
                    </thead>
                    <tbody>
                    <#list list as books>
                        <tr>
                            <td>${books.bookName}</td>
                            <td>${books.copiesAvailableForLoan} available</td>
                            <td>
                                    <select>
                                        <#list users as user>
                                    <option>${user.firstName} ${user.lastName}</option>
                                        </#list>
                                    </select>

                            </td>
                            <td><button type="submit" class="btn btn-primary btn-sm" disabled>Accept Loan</button></td>


                        </tr>
                        </#list>

                    </tbody>
                </table>
                <a href="/" class="btn btn-danger" role="button">Return</a>

        </main>
    </div>
</div>

<#include "partials/scripts.ftl">


</body>
</html>