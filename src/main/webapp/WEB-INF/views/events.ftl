<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div id="header">
            <p class="display-4 text-primary">Available Events</p>
        </div>
        <div id="content">
            <table class="table table-dark table-hover">
                <tr>
                    <th>Name</th>
                    <th>Price</th>
                    <th>Dates</th>
                </tr>
                <#list events as event>
                <tr>
                    <td>${event.name}</td>
                    <td>${event.basePrice}</td>
                    <td>
                    <#list event.airDates as date>
                        ${date} </br>
                    </#list>
                    </td>
                </tr>
                </#list>
            </table>
            <br/>
            <form method="POST" name="events" action="/uploadEvents" enctype="multipart/form-data">
                <table>
                    <tr>
                        <td>Select a file to upload</td>
                        <td><input type="file" name="files" /></td>
                    </tr>
                    <tr>
                        <td>Select a file to upload</td>
                        <td><input type="file" name="files" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Submit" /></td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>