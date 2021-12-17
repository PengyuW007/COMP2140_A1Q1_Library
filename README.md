# COMP2140_A1Q1Library

Description: 
Libraries contain a catalogue of books, that can be searched by author or title. Books can be
loaned and returned. In this question you will use commands given in an input file to build a
library, and to search for, and loan books.

• An application (main) class, that will read input from a file (see below) and output
results.

• A Book class, that will store information on one book. You should store the book title,
author first name/initials, author last name, and a boolean flag that indicates whether
the book is out on loan.

• A Library class, that contains a list of books (stored in an array). This class should have,
at minimum, the following methods:

    o A constructor, which creates an empty Library.
    o An addBook method, that takes the information for a book and adds a new Book
    to the library. Books must be stored in order by an author’s last name, then by
    first name, and then by title. It is possible for libraries to have multiple copies of
    the same book, so you may end up with multiple Book objects with the same
    author and title.
    o A listByAuthor method, that will return a String containing a list of books written
    by that author.
    o A listByTitle method, that will return a String containing a list of books with that
    title.
    o A loanBook method, that will take an author and title, and return a boolean
    indicating whether that Book is available for loan. If the Book is available, this
    method should update the flag in the Book object, to indicate that the book is
    out on loan, and return true. If the book is not found in the Library, or is already
    out on loan, return false.
    o A returnBook method, that will take an author and title, and return a boolean
    indicating whether the book was successfully returned. This method should
    update the flag in the Book object, to indicate that the book is available for loan.
    U
Valid commands in the input file are:

    • ADD – A line beginning with ADD will be followed by the book details (author last name,
    author first name, title). Commas separate the names and title. It is possible that there
    may be additional commas in a line of input, if there are commas in the title of the book.
    • SEARCHA – A line beginning with SEARCHA should result in a list of books with a given
    author last name.
    • SEARCHT – A line beginning with SEARCHT should result in a list of books with the given
    title.
    • GETBOOK – A line beginning with GETBOOK will attempt to borrow a book from the
    library. GETBOOK will be followed by the author last name, a comma, and then the title.
    • RETURNBOOK – A line beginning with RETURNBOOK will return a book to the library.
    RETURNBOOK will be followed by the author last name and title, in the same format as
    for GETBOOK
