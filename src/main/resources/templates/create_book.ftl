<#import "/spring.ftl" as spring />
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../../../favicon.ico">

    <title>Create a book</title>

    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <!-- Custom styles for this template -->

    <link href="/style.css" rel="stylesheet">
</head>

<body>
<nav class="navbar navbar-dark fixed-top bg-dark flex-md-nowrap p-0 shadow">
    <a class="navbar-brand col-sm-3 col-md-2 mr-0" href="/">Librarian Homepage</a>
    <div class="navbar-right">
    </div>



</nav>

<div class="container-fluid mt-5">
    <div class="row">
        <nav class="col-md-2 d-none d-md-block bg-light sidebar">
            <div class="sidebar-sticky">
                <ul class="nav flex-column">
                    <li class="nav-item">
                        <a class="nav-link active" href="/create_user">
                            <span data-feather="plus-circle"></span>
                            Create new user
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" href="/create_book"">
                            <span data-feather="plus-circle"></span>
                            Create new book
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" href="/manage_users">
                            <span data-feather="settings"></span>
                            Manage Users
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" href="/manage_books">
                            <span data-feather="settings"></span>
                            Manage Books
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" href="">
                            <span data-feather="book"></span>
                            Loan a book
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" href="">
                            <span data-feather="book"></span>
                            Return a book
                        </a>
                    </li>

                </ul>
            </div>
        </nav>
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

<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>

<!-- Icons -->
<script src="https://unpkg.com/feather-icons/dist/feather.min.js"></script>
<script>
    feather.replace()
</script>


</body>
</html>