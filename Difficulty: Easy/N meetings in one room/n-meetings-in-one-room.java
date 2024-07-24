//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            int start[] = new int[n];
            int end[] = new int[n];

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                start[i] = Integer.parseInt(inputLine[i]);

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) 
                end[i] = Integer.parseInt(inputLine[i]);
                
            int ans = new Solution().maxMeetings(start, end, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
     static class Meeting {
        int start;
        int end;

        Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    static class MeetingComparator implements Comparator<Meeting> {
        public int compare(Meeting m1, Meeting m2) {
            return Integer.compare(m1.end, m2.end);
        }
    }

    public static int maxMeetings(int start[], int end[], int n) {
        // Create a list of meetings
        List<Meeting> meetings = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            meetings.add(new Meeting(start[i], end[i]));
        }

        // Sort meetings by their end times
        Collections.sort(meetings, new MeetingComparator());

        int count = 0;
        int lastEndTime = -1;

        // Iterate through sorted meetings
        for (Meeting meeting : meetings) {
            if (meeting.start > lastEndTime) {
                // If the start time of the current meeting is greater
                // than the end time of the last selected meeting
                count++;
                lastEndTime = meeting.end;
            }
        }

        return count;
    }
}