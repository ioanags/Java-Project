<#import "/spring.ftl" as spring />
<!doctype html>
<html lang="en">
<head>
    <#include "partials/head.ftl">

    <title>Create a user</title>

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
                <h1 class="h2">Create User </h1>
            </div>
            <div class="container">
                <form action="/create_user" name="createUserForm"  id="createUserForm" method="POST" autocomplete="off">
                    <div class="form-group w-50">
                        <@spring.bind "createUserForm.firstName"/>
                        <label for="firstName"><strong>First Name</strong></label>
                        <input  name="firstName" type="text" class="form-control" id="first-name" placeholder="Enter user's first name">
                    </div>
                    <div class="form-group w-50">
                        <@spring.bind "createUserForm.lastName"/>
                        <label for="lastName"><strong>Last Name</strong></label>
                        <input  name="lastName" type="text" class="form-control" id="last-name" placeholder="Enter user's last name">
                    </div>
                    <div class="form-group w-50">
                        <@spring.bind "createUserForm.address"/>
                        <label for="address"><strong>Address</strong></label>
                        <input  name="address" type="text" class="form-control" id="address" placeholder="Enter user's address">
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