function showCourses(){
    fetch("http://localhost:8080/courses") 
    .then((response) => response.json())
    .then((courses) => {
        const dataTable = document.getElementById("coursetable")

        courses.forEach(course => {
            var row = `<tr>
            <td>${course.courseId}</td>
            <td>${course.courseName}</td>
            <td>${course.trainerName}</td>
            <td>${course.duration}</td>
            </tr>`

            dataTable.innerHTML+=row;
        });
    });
}
function showEnrolledStudents(){
    fetch("http://localhost:8080/courses/enrolled") 
    .then((response) => response.json()) 
    .then((students) => {
        const dataTable = document.getElementById("enrolledtable")

        students.forEach(student => {
            var row = `<tr>
            <td>${student.username}</td>
            <td>${student.email_id}</td>
            <td>${student.courseName}</td>
            </tr>`

            dataTable.innerHTML+=row;
        });
    });
}