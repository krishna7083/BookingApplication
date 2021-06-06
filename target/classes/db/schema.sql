--
-- Table structure for table `Hotels`
--
CREATE TABLE Hotels (
    hotelId int NOT NULL PRIMARY KEY AUTO_INCREMENT,
    city varchar(50) NOT NULL,
    noOfRooms int, 
    noOfStars int,
    wifiAvailability boolean,
    airConditionary boolean,
    mealsIncluded boolean,
    costOfStay int
);

--
-- Table structure for table 'Rooms'
--
CREATE TABLE Rooms(
    roomId int NOT NULL PRIMARY KEY AUTO_INCREMENT,
    hotelId int,
    roomDescription varchar(250)
);

--
-- Table structure for table 'Users'
--
CREATE TABLE Users(

    userId int NOT NULL PRIMARY KEY AUTO_INCREMENT,
    firstname varchar(50) NOT NULL,
    lastname varchar(50) NOT  NULL,
    gender varchar(10) NOT NULL,
    city varchar(50) NOT NULL
);

--
-- Table structure for table 'Review'
--
CREATE TABLE Reviews(
    reviewId int NOT NULL PRIMARY KEY AUTO_INCREMENT,
    hotelId int NOT NULL,
    userId int NOT NULL,
    comment varchar(500),
    rating int NOT NULL
);

--
-- Table structure for table 'Booking'
--
CREATE TABLE Booking(
    bookingId int NOT NULL PRIMARY KEY AUTO_INCREMENT,
    hotelId int NOT NULL,
    roomId int NOT NULL,
    userId int NOT NULL
);