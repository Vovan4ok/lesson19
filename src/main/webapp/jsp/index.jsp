<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
    <title>Student-form</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

    <div class="container">
        <c:choose>
            <c:when test="${mode == 'REGISTRATION'}">
                <form action="registerStudent" method="POST">
                    <div class="form-group">
                        <label for="name">Email:</label>
                        <input type="text" class="form-control" id="name" placeholder="Enter name" name="name">
                    </div>
                    <div class="form-group">
                        <label for="surname">Surname:</label>
                        <input type="text" class="form-control" id="surname" placeholder="Enter surname" name="surname">
                    </div>
                    <div class="form-group">
                        <label for="age">Age:</label>
                        <input type="text" class="form-control" id="age" placeholder="Enter age" name="age">
                    </div>
                    <div class="form-group">
                        <label for="photo">Photo:</label>
                        <input type="file" id="photo" name="photo">
                    </div>
                    <button type="submit" class="btn btn-default">Submit</button>
                </form>
            </c:when>
            <c:when test="${mode == 'REGISTERED'}">
                <div class="card-body text-center">
                    <img src="avatar.png" alt="avatar"
                         class="rounded-circle img-fluid" style="width: 150px; height: 100px;">
                    <h5 class="my-3">Student name: ${student.name}</h5>
                    <p class="text-muted mb-1">Student surname: ${student.surname}</p>
                    <p class="text-muted mb-4">Student age: ${student.age}</p>
                </div>
            </c:when>
        </c:choose>
    </div>

</body>
</html>
