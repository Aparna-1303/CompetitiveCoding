#include <stdio.h>

int main() {
	int testcases, episodes, duration, hours, minutes;
	scanf("%d", &testcases);
	int total_time[testcases];
	for(int i = 0; i <= testcases; i++)
	{
	    scanf("%d", &episodes);
	    scanf("%d", &duration);
	    total_time[i] = (episodes * duration);
	}
	for(int i = 0; i < testcases; i++)
	{
	    hours = total_time[i] / 60;
	    minutes = total_time[i] % 60;
	    printf("%d %d\n", hours, minutes);
	}
    return 0;
}
