## How to use WebsiteBuilder:

To start building a website, start with the semantic tags. These are Head, Header, Nav, Main, Form, Table and Footer.

Example of building header:

```java
Header header = Header.createElementBuilder()
        .addHeaderHeading("Hello, World!")
        .addHeaderHeading("image.url")
        .build();
```

Example of building the main tag including a form for registration:

```java
Form registrationForm = Form.createFormBuilder()
        .addTextLabel("Name")
        .addTextField()
        .addTextLabel("Address")
        .addTextField()
        .addTextLabel("ZIP")
        .addTextField()
        .addEmailField()
        .addNumberLabel("Age")
        .addNumberField()
        .addButtonLabel("Register")
        .addSubmitButton()
        .build();

Main main = Main.createElementBuilder()
        .addMainHeading("Registration form:")
        .addForm(registrationForm)
        .build();
```

These objects can be added to a page. If no tags are added, the default value will be used instead.

```java
Registration registrationPage = Registration.createPageBuilder()
        .addHeader(header)
        .addMain(main)
        // Let's image we've created a footer.
        .addFooter(footer)
        .build();
```

After the pages are created, they can be added to the project.
The option to choose between dark and light themes. In addition, a stylesheet and robots.txt can be added.
```java
Page[] HTMLpages = new Page[]{homePage, registrationPage};

WebsiteBuilder project = WebsiteBuilder.createWebsiteBuilder()
        .addProjectFolder("WebsiteBuilder Project")
        .addTheme(Theme.DARK)
        .addHTMLPages(HTMLpages)
        // Need to create a Style page.
        .addStylesheetFile(styles)
        .addRobots()
        .build();
```