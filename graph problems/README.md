# Graph Problems

This folder contains graph algorithm problems solved in:

- Java
- C++

## Folder Layout

```text
graph problems/
├── README.md
├── java/
│   ├── README.md
│   └── .gitkeep
└── cpp/
        ├── README.md
        └── .gitkeep
```

## Language Folders

- `java/`: Java solutions (`.java`)
    - README: [java/README.md](java/README.md)
- `cpp/`: C++ solutions (`.cpp`)
    - README: [cpp/README.md](cpp/README.md)

## Problem Index (Extensible)

Add one row per problem. Keep both language file names in sync where possible.

| # | Problem | Difficulty | Java File | C++ File | Status | Notes |
| --- | --- | --- | --- | --- | --- | --- |
| 1 | Example: Number of Islands | Medium | `java/number-of-islands.java` | `cpp/number-of-islands.cpp` | Planned | BFS/DFS |

## Naming Convention

Use kebab-case file names:

- `problem-name.java`
- `problem-name.cpp`

Examples:

- `java/number-of-islands.java`
- `cpp/number-of-islands.cpp`

## Adding a New Problem

1. Add Java solution in `java/`.
2. Add C++ solution in `cpp/`.
3. Add one entry in the Problem Index table.
4. (Optional) Add approach and complexity notes in the `Notes` column.

## Suggested Topic Tags (Optional)

You can include tags in `Notes` for faster filtering:

- BFS
- DFS
- Topological Sort
- Union Find
- Shortest Path
- MST
