# DSA Repository

A collection of Data Structures and Algorithms problems organized by topic.

## Folder Structure

The repository is intentionally topic-based so it can grow easily.

```text
DSA/
├── graph problems/
├── dynamic programming problems/        # add when ready
├── array problems/                      # add when ready
├── tree problems/                       # add when ready
└── README.md
```

## Topics Index

Use this section as a scalable index. Add one row whenever you add a new topic folder.

| Topic | Folder | Status | Notes |
| --- | --- | --- | --- |
| Graph Problems | graph problems | Active | Existing folder |
| Dynamic Programming Problems | dynamic programming problems | Planned | Add folder and problems |
| Array Problems | array problems | Planned | Add folder and problems |
| Tree Problems | tree problems | Planned | Add folder and problems |

## How To Extend

When adding a new topic (for example, dynamic programming):

1. Create a new folder using the same naming pattern: `<topic> problems`.
2. Add problem solution files inside that folder.
3. Add or update a short topic-level README inside that folder (optional but recommended).
4. Add the new topic in the Topics Index table above.

## Recommended Naming Convention

- Topic folders: `<topic> problems`
- Problem files: `problem-name.ext`
- Optional variants:
  - `problem-name-bruteforce.ext`
  - `problem-name-optimized.ext`

Examples:

- `graph problems/number-of-islands.cpp`
- `dynamic programming problems/longest-increasing-subsequence.py`

## Contribution Flow (Personal)

1. Pick a topic folder.
2. Add the solution file.
3. If useful, add a brief comment at the top explaining approach and complexity.
4. Update the Topics Index if a new topic was introduced.

## Future Enhancements

- Add difficulty subfolders (`easy`, `medium`, `hard`) inside each topic.
- Add one README per topic with curated problem lists.
- Add language-specific subfolders if needed (`cpp`, `python`, `java`).
