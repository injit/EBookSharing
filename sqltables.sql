
CREATE TABLE UserInfo
(
username VARCHAR(20) NOT NULL PRIMARY KEY ,
password VARCHAR(20) NOT NULL,
email    VARCHAR(20) NOT NULL,
firstname VARCHAR(20) NOT NULL,
lastname  VARCHAR(20) NOT NULL,
is_SU BOOLEAN,
point_balance SMALLINT DEFAULT 0
);




CREATE TABLE BookInfo
(
bookID  SMALLINT NOT NULL PRIMARY KEY
GENERATED ALWAYS AS IDENTITY
(START WITH 1, INCREMENT BY 1),
bookname VARCHAR(50) NOT NULL,
cover BLOB NOT NULL,
author VARCHAR(20),
summary VARCHAR(1000),
bookfile BLOB NOT NULL,
uploader VARCHAR(20) NOT NULL,
award_points SMALLINT NOT NULL,
reading_point SMALLINT NOT NULL,
read_counts SMALLINT,
last_date_read DATE,
rating SMALLINT,
rating_counts SMALLINT,
FOREIGN KEY (uploader) REFERENCES UserInfo(username)
);



CREATE TABLE Review_Rating(
rrID INT NOT NULL PRIMARY KEY
GENERATED ALWAYS AS IDENTITY
(START WITH 1, INCREMENT BY 1),
bookID SMALLINT NOT NULL ,
username VARCHAR(20) NOT NULL,
review_text VARCHAR(1000),
rating SMALLINT,
FOREIGN KEY (bookID) REFERENCES BookInfo(bookID)
);



CREATE TABLE ReadingHistory(
rhID INT NOT NULL PRIMARY KEY
GENERATED ALWAYS AS IDENTITY
(START WITH 1, INCREMENT BY 1),
username VARCHAR(20) NOT NULL,
bookID SMALLINT NOT NULL,
FOREIGN KEY(bookID) REFERENCES BookInfo(bookID)
);



CREATE TABLE PendingBook(
pbID INT NOT NULL PRIMARY KEY
GENERATED ALWAYS AS IDENTITY
(START WITH 1, INCREMENT BY 1),
uploader VARCHAR(20) NOT NULL,
bookname VARCHAR(50) NOT NULL,
cover BLOB NOT NULL,
author VARCHAR(20),
summary VARCHAR(1000),
bookfile BLOB NOT NULL,
request_points SMALLINT NOT NULL,
granted_points SMALLINT NOT NULL,
FOREIGN KEY(uploader) REFERENCES UserInfo(username)
);



CREATE TABLE Message(
mID INT NOT NULL PRIMARY KEY
GENERATED ALWAYS AS IDENTITY
(START WITH 1, INCREMENT BY 1),
username VARCHAR(20) NOT NULL,
message VARCHAR(100) NOT NULL,
FOREIGN KEY(username) REFERENCES UserInfo(username)
);


CREATE TABLE Invitation(
invID INT NOT NULL PRIMARY KEY
GENERATED ALWAYS AS IDENTITY
(START WITH 1, INCREMENT BY 1),
inviter VARCHAR(20),
invitee VARCHAR(20),
bookID SMALLINT NOT NULL,
FOREIGN KEY(bookID) REFERENCES BookInfo(bookID),
FOREIGN KEY(inviter) REFERENCES UserInfo(username),
FOREIGN KEY(invitee) REFERENCES UserInfo(username)
);

CREATE TABLE complaint(
cID INT NOT NULL PRIMARY KEY
GENERATED ALWAYS AS IDENTITY
(START WITH 1, INCREMENT BY 1),
username VARCHAR(20),
bookID SMALLINT NOT NULL,
complaint_text VARCHAR(1000),
FOREIGN KEY(username) REFERENCES UserInfo(username),
FOREIGN KEY(bookID) REFERENCES BookInfo(bookID)
);



CREATE TABLE BlackList(
blID INT NOT NULL PRIMARY KEY
GENERATED ALWAYS AS IDENTITY
(START WITH 1, INCREMENT BY 1),
email VARCHAR(20)
);
