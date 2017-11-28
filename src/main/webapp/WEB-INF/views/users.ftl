<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script>

    </head>
    <body>
        <div id="header">
            <p class="display-4 text-primary">Available Users</p>
        </div>
        <div id="content">
            <table class="table table-dark table-hover">
                <tr>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Email</th>
                    <th>Birthday</th>
                </tr>
                <#list users as user>
                <tr>
                    <td>${user.firstName}</td>
                    <td>${user.lastName}</td>
                    <td>${user.email}</td>
                    <td>${user.birthday}</td>
                </tr>
                </#list>
            </table>
            <p class="display-6 text-primary">Add new User</p>
            <form name="user" action="/user/add">
                <div class="form-group">
                    <label for="email">First Name</label>
                    <input class="form-control" name="firstName" />
                    <label for="email">Last Name</label>
                    <input class="form-control" name="lastName" />
                    <label for="email">Email</label>
                    <input class="form-control" name="email" />
                    <label for="email">DOB</label>
                    <input class="form-control" name="birthday" />
                    <input class="btn btn-primary" type="submit" value="Add" />
                </div>
            </form>
            <br/>
            </br>
            <form name="user" action="/user/getByEmail">
                <div class="form-group">
                    <label for="email">Email</label>
                    <input type="email" class="form-control" id="email" name="email" />
                    <input class="btn btn-primary" type="submit" value="Go" />
                </div>
            </form>
        </div>
    </body>
</html>