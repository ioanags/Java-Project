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
                        <th>#</th>
                        <th>Book Name</th>
                        <th>Book Summary</th>
                        <th>ISBN</th>
                        <th>Copies Purchased</th>
                        <th>Copies Available</th>
                        <th>Delete</th>
                    </tr>
                    </thead>
                    <tbody>
                    <#list list as books>
                        <tr>
                            <td>${books.id}</td>
                            <td>${books.bookName}</td>
                            <td>${books.bookSummary}</td>
                            <td>${books.isbn?c}</td>
                            <td>${books.copiesPurchased}</td>
                            <td>${books.copiesAvailableForLoan}</td>

                            <td>
                                <form action="/delete_book" name="deleteForm" method="GET">
                                    <input type="hidden" name="id" value="${books.id}" />
                                    <button class="btn btn-danger button-delete-confirmation" onclick="return confirm('Are you sure you want to delete this book?');" type="submit" name="action" value="Delete">Delete</button>
                                </form>
                            </td>
                        </tr>

                    </#list>
                    </tbody>
                </table>

        </main>
    </div>
</div>

<#include "partials/scripts.ftl">


</body>
</html>