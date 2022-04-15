<!DOCTYPE html>
<html lang="en">

<head>
    <title>PHP Form</title>
    <link rel="stylesheet" href="stylesheets/main.css">
</head>

<body>
    <?php
    function test_input($data)
    {
        $data = htmlspecialchars($data);
        $data = trim($data);
        $data = stripslashes($data);
        return $data;
    }

    function echo_regex($data, $pattern, $msg, $err_msg_match, $err_msg_empty)
    {
        if (!empty($data)) {
            if (preg_match($pattern, $data)) {
                echo $msg;
            } else {
                echo $err_msg_match;
            }
        } else {
            echo $err_msg_empty;
        }
    }

    function echo_normal($data, $msg, $err_msg_empty)
    {
        if (!empty($data)) {
            echo $msg;
        } else {
            echo $err_msg_empty;
        }
    }

    if (isset($_POST["submit"])) {
        $name = $_POST["name"];
        $name = test_input($name);

        $email = $_POST["email"];
        $email = test_input($email);

        $website = $_POST["website"];
        $website = test_input($website);

        $comment = $_POST["comment"];
        $comment = test_input($comment);

        $gender = $_POST["gender"];
        $gender = test_input($gender);
    } else {
        die("Sorry, you cannot access this page!");
    }
    ?>

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
                    <?php
                    echo_regex(
                        $name,
                        "/^[a-zA-Z-' ]*$/",
                        "Thanks, <b>" . $name . "</b><br>",
                        "Invalid name format! Only letters, white space, dot (.), and dash(-) are allowed<br>",
                        "Name is required<br>"
                    );

                    if (!empty($email)) {
                        if (filter_var($email, FILTER_VALIDATE_EMAIL)) {
                            echo "Your email is " . $_POST["email"] . "<br>";
                        } else {
                            "Invalid email format<br>";
                        }
                    } else {
                        echo "Email is required<br>";
                    }

                    echo_regex(
                        $website,
                        "/\b(?:(?:https?|ftp):\/\/|www\.)[-a-z0-9+&@#\/%?=~_|!:,.;]*[-a-z0-9+&@#\/%=~_|]/i",
                        "Your website is " . $website . "<br>",
                        "Invalid URL!<br>",
                        "You don't have a website!<br>"
                    );

                    echo_normal(
                        $comment,
                        "Your comment is \"" . $comment . "\"<br>",
                        "You don't have any comment!<br>"
                    );

                    echo_normal(
                        $gender,
                        "Your gender is " . $gender . "<br>",
                        "Gender is required<br>"
                    );
                    ?>
                </div>
            </section>
        </article>
    </div>

    <footer></footer>
</body>

</html>