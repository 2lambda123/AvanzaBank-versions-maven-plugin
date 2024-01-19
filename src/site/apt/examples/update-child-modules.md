
## Output
After running the `versions:update-child-modules` goal, you should see output similar to the following:
```
[INFO] Scanning for projects...
[INFO] ------------------------------------------------------------------------
[INFO] Building update-child-modules
[INFO]    task-segment: [versions:update-child-modules] (aggregator-style)
[INFO] ------------------------------------------------------------------------
[INFO] [versions:update-child-modules]
[INFO] Module: bar-child
[INFO]   Parent was com.foo.bar:bar:1.0, now com.foo.bar:bar:2.0
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESSFUL
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 3 seconds
[INFO] Finished at: Thu Nov 20 15:37:40 GMT 2008
[INFO] Final Memory: 12M/288M
[INFO] ------------------------------------------------------------------------
