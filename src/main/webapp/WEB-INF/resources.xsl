<?xml version="1.0" encoding="UTF-8"?>
<tomee>
    <!-- see http://tomee.apache.org/containers-and-resources.html -->
    <!-- see http://tomee.apache.org/datasource-config.html -->

    <!-- H2 Database -->
    <Resource id="PaintingsDataSource" type="DataSource">
        JdbcDriver = org.h2.Driver
        JdbcUrl = jdbc:h2:~/h2database/PaintingGalleryDB;AUTO_SERVER=TRUE;
        UserName = sa
        Password = sa
        InitialSize = 1
        MaxActive = 10
        MaxWaitTime = 10 seconds
        MaxIdle = 2
        MinIdle = 1
        ValidationQuery = SELECT 1 FROM DUAL
        TestOnBorrow = true
        TestWhileIdle = true
        TimeBetweenEvictionRuns = 2 min
        removeAbandoned = true
        removeAbandonedTimeout = 600
        logAbandoned = true
        jmxEnabled = true
    </Resource>
</tomee>