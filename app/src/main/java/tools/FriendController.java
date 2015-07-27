package tools;

/**
 * Created by user on 7/26/2015.
 */

import types.FriendInfo;



import types.FriendInfo;

/**
 * Created by user on 7/20/2015.
 */

public class FriendController
{

    private static FriendInfo[] friendsInfo = null;
    private static FriendInfo[] unapprovedFriendsInfo = null;
    private static String activeFriend;

    public static void setFriendsInfo(FriendInfo[] friendInfo)
    {
        FriendController.friendsInfo = friendInfo;
    }



    public static FriendInfo checkFriend(String username, String userKey)
    {
        FriendInfo result = null;
        if (friendsInfo != null)
        {
            for (int i = 0; i < friendsInfo.length; i++)
            {
                if ( friendsInfo[i].userName.equals(username) &&
                        friendsInfo[i].userKey.equals(userKey)
                        )
                {
                    result = friendsInfo[i];
                    break;
                }
            }
        }
        return result;
    }

    public static void setActiveFriend(String friendName){
        activeFriend = friendName;
    }

    public static String getActiveFriend()
    {
        return activeFriend;
    }



    public static FriendInfo getFriendInfo(String username)
    {
        FriendInfo result = null;
        if (friendsInfo != null)
        {
            for (int i = 0; i < friendsInfo.length; i++)
            {
                if ( friendsInfo[i].userName.equals(username) )
                {
                    result = friendsInfo[i];
                    break;
                }
            }
        }
        return result;
    }



    public static void setUnapprovedFriendsInfo(FriendInfo[] unapprovedFriends) {
        unapprovedFriendsInfo = unapprovedFriends;
    }



    public static FriendInfo[] getFriendsInfo() {
        return friendsInfo;
    }



    public static FriendInfo[] getUnapprovedFriendsInfo() {
        return unapprovedFriendsInfo;
    }




}