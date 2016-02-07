# slack_slashcommand 
https://api.slack.com/slash-commands

A quick spring boot app, to create your own slack slash command.

Edit the <a href="https://github.com/darubramha89/slack_slashcommand/blob/master/src/main/java/com/darubramha/slack/controllers/SlackController.java">Controller File</a> to serve your desired content.

Run the command in the root folder of this project (same as README you are just reading)

    mvn install


It will create a target folder containing the runnable jar file, named <b>slack.jar</b>

Run the jar file

    java -jar slack.jar

Your webapp is ready and running! 

PS : The default port it runs on is 7090. Edit the <a href="https://github.com/darubramha89/slack_slashcommand/blob/master/src/main/resources/application.properties">application.properties</a> file to change this.
Happy Slacking!
