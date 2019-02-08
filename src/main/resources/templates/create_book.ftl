<#import "/spring.ftl" as spring />
<!doctype html>
<html lang="en">
<head>
    <#include "partials/head.ftl">

    <title>Create a book</title>

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
                <h1 class="h2">Create Book </h1>
            </div>
            <div class="container">
                <form action="/create_book" name="createBookForm"  id="createBookForm" method="POST" autocomplete="off">
                    <div class="form-group w-50">
                        <label for="bookName"><strong>Book Name </strong></label>
                        <input  name="bookName" type="text" class="form-control" id="bookName" placeholder="Enter book's name">
                    </div>
                    <div class="form-group w-50">
                        <label for="bookSummary"><strong>Book Summary</strong></label>
                        <input  name="bookSummary" type="text" class="form-control" id="bookSummary" placeholder="Enter book's summary">
                    </div>
                    <div class="form-group w-50">
                        <label for="isbn"><strong>ISBN</strong></label>
                        <input  name="isbn" type="text" class="form-control" id="isbn" placeholder="Enter ISBN">
                    </div>
                    <div class="form-group w-50">
                        <label for="copiesPurchased"><strong>No. of Copies</strong></label>
                        <input  name="copiesPurchased" type="text" class="form-control" id="copiesPurchased" placeholder="Enter no. of copies">
                    </div>
                    <div class="form-group w-50">
                        <label for="copiesAvailableForLoan"><strong>No. of copies available for loan</strong></label>
                        <input  name="copiesAvailableForLoan" type="text" class="form-control" id="copiesAvailableForLoan" placeholder=" Enter No. of copies available for loan">
                    </div>

                    <button type="submit" class="btn btn-primary clearfix">Save</button>
                    <a href="/" class="btn btn-danger" role="button">Cancel</a>
                </form>
            </div>

        </main>
    </div>
</div>

<#include "partials/scripts.ftl">

</body>
</html>