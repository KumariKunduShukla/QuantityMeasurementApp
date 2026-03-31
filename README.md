# Development Branch (dev)

## Overview
The **dev branch** is the main development branch for the **Quantity Measurement Application**.

All **Use Cases (UC1 – UC22)** are implemented and integrated through this branch.  
Each use case is developed in its own feature branch and later merged into the `dev` branch.

## Branch Strategy

```
main
  |
  └── dev
        ├── UC1
        ├── UC2
        ├── UC3
        ├── ...
        ├── UC15
        ├── ...
        └── UC22
```

## Development Workflow

1. Create a new branch from `dev` for the specific use case.
2. Implement the required functionality.
3. Test the implementation.
4. Merge the branch back into `dev`.

Example:

```
git checkout dev
git checkout -b UC15-N-Tier-Architecture
```

After completing the implementation:

```
git checkout dev
git merge UC15-N-Tier-Architecture
```

## Purpose of dev Branch

- Central integration branch for all development
- Contains the latest combined implementation of all use cases
- Ensures structured and organized development workflow

## Technologies Used

- Java
- JUnit
- Maven
- Git
