<!DOCTYPE html>
<html lang="en">

<head>
    <title>PHP Form</title>
    <link rel="stylesheet" href="stylesheets/main.css">
</head>

<body>
    <header>
        <h1>Senoaji Sapta Ramadhana</h1>
        <h4>6706213109</h4>
        <h4>D3 RPLA 45-02</h4>
    </header>

    <div class="flex-container">
        <article>
            <section class="article-title">Student Union Form</section>

            <section class="card margin-center">
                <div class="card-content">
                    <form action="process.php" method="post">
                        <table>
                            <tr>
                                <th>Name</th>
                                <th>:</th>
                                <th><input type="text" name="name"></th>
                            </tr>
                            <tr>
                                <th>Email</th>
                                <th>:</th>
                                <th><input type="email" name="email"></th>
                            </tr>
                            <tr>
                                <th>Website</th>
                                <th>:</th>
                                <th><input type="url" name="website"></th>
                            </tr>
                            <tr>
                                <th>Comment</th>
                                <th>:</th>
                                <th><textarea name="comment" cols="40" rows="5"></textarea></th>
                            </tr>
                            <tr>
                                <th>Gender</th>
                                <th>:</th>
                                <th>
                                    <input type="radio" name="gender" value="male">Male
                                    <input type="radio" name="gender" value="female">Female
                                    <input type="radio" name="gender" value="other" checked="checked">Other
                                </th>
                            </tr>
                        </table>
                        <input type="submit" name="submit" value="submit">
                    </form>
            </section>
        </article>
    </div>

    <footer></footer>
</body>

</html>