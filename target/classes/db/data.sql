--
-- INSERT DATA INTO Hotels
--
INSERT INTO Hotels (
    city
    noOfRooms, 
    noOfStars,
    wifiAvailability,
    airConditionary,
    mealsIncluded,
    costOfStay) VALUES (
        "Pune",
        40,
        3
        true,
        true,
        true,
        1000
    ),
    (
        "Mumbai",
        60,
        5
        true,
        true,
        true,
        4000

    );

--
-- INSERT DATA INTO Hotels
--
INSERT INTO Rooms(
    roomId,
    hotelId,
    roomDescrition
) VALUES (1,"room_deciption1"),(1,"room_description_2"),(2,"room_description_of_hotel2");

--
-- INSERT DATA INTO Users
--
INSERT INTP Users(
    firstname,
    lastname,
    gender,
    city
) VALUES ("john","mulhal","male","callifornia"),
        ("kevin","maldanodo","male","bostorn"),
        ("kriti","patris","female","tokiyo");
--
-- INSERT DATA INTO Reviews
--
INSERT INTO Reviews(
    hotelId,
    userId,
    comment,
    rating
) VALUES (1,1,"good one",8), (1,2,"bad one",3),(2,1,"bad one",4),(2,3,"ossum",9);

--
-- INSERT DATA INTO Bookins
--
INSERT INTO Booking(,
    hotelId,
    roomdId,
    userId
) VALUES (1,1,1), (1,2,2),(2,3,3);