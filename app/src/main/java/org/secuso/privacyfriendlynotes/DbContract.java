package org.secuso.privacyfriendlynotes;

import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Contract used for accessing the Database
 * Created by Robin on 11.06.2016.
 */
public class DbContract {
    public DbContract(){}

    public static Uri NOTES_URI = Uri.parse("content://" + DbContentProvider.AUTHORITY + "/notes");
    public static Uri CATEGORIES_URI = Uri.parse("content://" + DbContentProvider.AUTHORITY + "/categories");
    public static Uri NOTIFICATIONS_URI = Uri.parse("content://" + DbContentProvider.AUTHORITY + "/notifications");

    public static abstract class NoteEntry implements BaseColumns {
        public static final String TABLE_NAME = "notes";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UUID = "uuid";
        public static final String COLUMN_TIMESTAMP = "timestamp";
        public static final String COLUMN_TYPE = "type";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_CONTENT = "content";
        public static final String COLUMN_CATEGORY = "category";
        public static final String COLUMN_TRASH = "in_trash";
        public static final String COLUMN_DELETED = "deleted";
        public static final int TYPE_TEXT = 1;
        public static final int TYPE_AUDIO = 2;
        public static final int TYPE_CHECKLIST = 3;
        public static final int TYPE_SKETCH = 4;
    }

    public static abstract class CategoryEntry implements BaseColumns {
        public static final String TABLE_NAME = "categories";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_NAME = "name";
    }

    public static abstract class NotificationEntry implements BaseColumns {
        public static final String TABLE_NAME = "notifications";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_NOTE = "note";
        public static final String COLUMN_TIME = "time";
    }
}
