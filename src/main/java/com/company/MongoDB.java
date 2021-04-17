package com.company;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.*;
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClientSettings;
import com.mongodb.ConnectionString;
import com.mongodb.ServerAddress;
import com.mongodb.MongoCredential;
import com.mongodb.MongoClientSettings;
import java.util.Arrays;

public class MongoDB {

    public void connectMongoDB() {
        MongoClient mongoClient = MongoClients.create(
                "mongodb+srv://gigicu01:<Nidodage01>@cluster0.5i6vl.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
        MongoDatabase database = mongoClient.getDatabase("test");
    }
}
