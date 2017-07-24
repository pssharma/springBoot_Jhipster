import { BaseEntity } from './../../shared';

export class TaskMySuffix implements BaseEntity {
    constructor(
        public id?: string,
        public title?: string,
        public description?: string,
    ) {
    }
}
